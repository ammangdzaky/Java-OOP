package LoginApp;

public class LoginException extends Exception{

    public LoginException(String message){
        this.message = message;
    }

    private String message;

    public String getMessage(){
        return this.message;
    }
}
