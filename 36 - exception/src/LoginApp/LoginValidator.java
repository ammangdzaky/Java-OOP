package LoginApp;

public class LoginValidator {

    final private String validUsername = "admin";
    final private String validPassword = "admin1234";

    public void validation (String username, String password) throws LoginException, NullPointerException {

        if (username == null || password == null) {  // cek null input
            throw new NullPointerException("Username and password cannot be null");

        } else if (!username.equals(validUsername)) {  // cek username
            throw new LoginException("Invalid username");

        } else if (!password.equals(validPassword)) {   // cek password
            throw new LoginException("Invalid password");
        }
    }
}
