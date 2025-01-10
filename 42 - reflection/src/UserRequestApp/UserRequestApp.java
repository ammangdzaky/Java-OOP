package UserRequestApp;

public class UserRequestApp {

    public static void main(String[] args) {

        CreateUser user = new CreateUser();

        user.setUsername("Midas");

        ValidationUtil.ValidationReflection(user);
    }
}
