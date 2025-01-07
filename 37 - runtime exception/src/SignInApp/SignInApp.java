package SignInApp;

import java.util.Scanner;

public class SignInApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ValidationUtil validator = new ValidationUtil();

        System.out.println("\n=== WELCOME TO SIGN IN PAGE ===\n");

        System.out.print("Enter your username:    ");
        String username = sc.nextLine();

        System.out.print("Enter your password:    ");
        String password  = sc.nextLine();

        try{
            validator.validator(username, password);
            System.out.println("Login successful : Wellcome " + username + "!");
        } catch (NullPointerException | BlankException except){
            System.out.println("Login failed : " + except.getMessage());
        }
    }
}
