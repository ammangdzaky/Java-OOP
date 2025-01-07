import java.util.Scanner;

public class OpenFileApp {

    public static void main(String[] args) {

        CheckerUtil check = new CheckerUtil();
        Scanner sc = new Scanner(System.in);

        System.out.println("\n WELCOME TO APP \n");
        System.out.print("Enter your file:    ");
        String fileName = sc.nextLine();

        check.checker(fileName); // tidak direkomendasikan untuk di try catch

        System.out.println("Sucessfully opened file : " + fileName);
    }
}
