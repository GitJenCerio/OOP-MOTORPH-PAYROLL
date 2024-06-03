
package authentication;

import java.sql.SQLException;
import javax.naming.AuthenticationException;

public interface AuthenticationService {
    int[] authenticate(String username, String password) throws SQLException, AuthenticationException;
}
