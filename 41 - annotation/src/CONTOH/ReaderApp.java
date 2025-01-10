package CONTOH;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;

// KODE : menggunakan annotation
@AnnotationInfo(author = "Dzaky", date = "10 January 2025", version = 1)  // biarpun tidak ada version tidak bakal eror karena version mempunyai nilai default


public class ReaderApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file name:      ");
        String fileName = sc.nextLine();

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            while(true){
                String line = reader.readLine();
                if (line == null) break;
                System.out.println(line);
            }
            System.out.println("Succesfull");
        } catch (IOException e){
            System.out.println("File failed to read : " + e.getMessage());
        }
    }
}
