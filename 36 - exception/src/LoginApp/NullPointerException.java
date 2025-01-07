package LoginApp;

public class NullPointerException extends Exception{

    public NullPointerException(String message){
        this.message = message;
    }

    private String message;

    public String getMessage(){
        return this.message;
    }
}
