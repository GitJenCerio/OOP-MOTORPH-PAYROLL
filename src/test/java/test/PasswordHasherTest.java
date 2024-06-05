/*package test;

import authentication.PasswordHash;
import org.junit.jupiter.api.Test;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class PasswordHashTest {

    @Test
    void hashPassword_ValidPassword_ReturnsHash() throws NoSuchAlgorithmException {
        // Arrange
        String password = "password123";
        String expectedHash = "5e884898da28047151d0e56f8dc6292773603d0d6aabbdd62a11ef721d1542d8"; // Expected hash for "password123"
        MessageDigest digest = MessageDigest.getInstance("SHA-256");

        // Act
        String actualHash = PasswordHash.hashPassword(password, digest);

        // Assert
        assertNotNull(actualHash);
        assertEquals(expectedHash, actualHash);
    }

    @Test
    void hashPassword_EmptyPassword_ReturnsEmptyHash() throws NoSuchAlgorithmException {
        // Arrange
        String password = "";
        MessageDigest digest = MessageDigest.getInstance("SHA-256");

        // Act
        String actualHash = PasswordHash.hashPassword(password, digest);

        // Assert
        assertNotNull(actualHash);
        assertEquals("d41d8cd98f00b204e9800998ecf8427e", actualHash); // Expected hash for empty string
    }

    @Test
    void hashPassword_NullPassword_ReturnsNull() throws NoSuchAlgorithmException {
        // Arrange
        String password = null;
        MessageDigest digest = MessageDigest.getInstance("SHA-256");

        // Act
        String actualHash = PasswordHash.hashPassword(password, digest);

        // Assert
        assertNull(actualHash);
    }

    @Test
    void hashPassword_ExceptionThrown_ReturnsNull() {
        // Arrange
        String password = "password123";
        MessageDigest digest = mock(MessageDigest.class);
        when(digest.digest(any())).thenThrow(new RuntimeException("Error"));

        // Act
        String actualHash = PasswordHash.hashPassword(password, digest);

        // Assert
        assertNull(actualHash);
    }
}*/
