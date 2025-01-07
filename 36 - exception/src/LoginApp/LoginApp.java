package LoginApp;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class LoginApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LoginValidator validator = new LoginValidator();

        System.out.println("=== WELCOME TO LOGIN PAGE ===\n");

        System.out.print("Enter your username :   ");
        String username = sc.nextLine();

        System.out.print("Enter your password : ");
        String password = sc.nextLine();

        try{
            validator.validation(username, password);
            System.out.println("Login Successful");

        } catch (LoginException | NullPointerException e){
            System.out.println("Eror : " + e.getMessage());
            System.out.println("Please try again");

        } finally {
            System.out.println("\nProgram end");
        }


    }
}
