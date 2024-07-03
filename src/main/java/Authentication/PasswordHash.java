package authentication;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.SecureRandom;
import java.util.Base64;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public final class PasswordHash {

    private static final int SALT_LENGTH = 16;
    private static final int ITERATIONS = 10000;
    private static final int KEY_LENGTH = 256;

    // Private constructor to prevent instantiation
    private PasswordHash() {
        throw new AssertionError("Cannot instantiate utility class");
    }

    public static String hashPassword(String password) throws HashingException {
        try {
            SecureRandom random = new SecureRandom();
            byte[] salt = new byte[SALT_LENGTH];
            random.nextBytes(salt);

            byte[] hash = pbkdf2(password.toCharArray(), salt, ITERATIONS, KEY_LENGTH);
            byte[] hashWithSalt = new byte[salt.length + hash.length];
            System.arraycopy(salt, 0, hashWithSalt, 0, salt.length);
            System.arraycopy(hash, 0, hashWithSalt, salt.length, hash.length);

            return Base64.getEncoder().encodeToString(hashWithSalt);
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            throw new HashingException("Error occurred while hashing the password", e);
        }
    }

    public static boolean validatePassword(String password, String storedHash) throws HashingException {
        try {
            byte[] hashWithSalt = Base64.getDecoder().decode(storedHash);
            byte[] salt = new byte[SALT_LENGTH];
            byte[] hash = new byte[hashWithSalt.length - SALT_LENGTH];

            System.arraycopy(hashWithSalt, 0, salt, 0, SALT_LENGTH);
            System.arraycopy(hashWithSalt, SALT_LENGTH, hash, 0, hash.length);

            byte[] testHash = pbkdf2(password.toCharArray(), salt, ITERATIONS, KEY_LENGTH);
            return MessageDigest.isEqual(hash, testHash);
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            throw new HashingException("Error occurred while validating the password", e);
        }
    }

    private static byte[] pbkdf2(char[] password, byte[] salt, int iterations, int keyLength) 
            throws NoSuchAlgorithmException, InvalidKeySpecException {
        PBEKeySpec spec = new PBEKeySpec(password, salt, iterations, keyLength);
        SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
        return skf.generateSecret(spec).getEncoded();
    }

    public static class HashingException extends Exception {
        public HashingException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}


