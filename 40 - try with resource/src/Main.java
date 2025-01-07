import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 - di java 7, terdapapt fitur baru yang bernama try with resource
 - try with resource adalah sebuah mekanisme agar kita lebih mudah menggunakan resource(sesuaut yang harus di close setelah digunakan) dalam block try
 - jika ingin menggunakan fitur ini, kita wajib menggunakan interface AutoCloseable
 */

public class Main {
    public static void main(String[] args) {

        // close manual

        BufferedReader reader = null;

        try{
            reader = new BufferedReader(
                    new FileReader("README.md")
            );
            while (true){
                String text = reader.readLine();
                if (text == null) break;
                System.out.println(text);
            }
        } catch (Exception except){
            System.out.println("File failed to open : " + except.getMessage());
        } finally{
            if (reader != null){
                try{
                    reader.close();
                    System.out.println("file succesfull close");
                } catch (IOException except){
                    except.printStackTrace();
                }
            }
        }



    }
}