import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class ReaderUtil {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file name:    ");
        String file = sc.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            while(true){
                String ele = reader.readLine();
                if (ele == null) break;
                System.out.println(ele);
            }
            System.out.println("File succesfull to read");
        } catch (IOException except){
            System.out.println("File failed to read : " + except.getMessage());
        }
    }
}
