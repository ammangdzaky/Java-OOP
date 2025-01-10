package UserRequestApp;

public class CreateUser {


    // tidak perlu lagi if else manual untuk set passwrord atau username agar tidak blank / null
    @NotBlank
    private String username;

    @NotBlank
    private String password;




    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
