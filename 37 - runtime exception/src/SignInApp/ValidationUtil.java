package SignInApp;

public class ValidationUtil {

    public static void validator(String username, String password){  // tidak wajib menggunakan throws

        // username check
        if (username == null){
            throw  new NullPointerException("Username cannot be null");
        } else if (username.isBlank()){
            throw new BlankException("Username cannot be blank");

        // password check
        } else if (password == null){
            throw new NullPointerException("Password cannot be null");
        } else if (password.isBlank()){
            throw new BlankException("Password cannot be blank");
        }
    }
}
