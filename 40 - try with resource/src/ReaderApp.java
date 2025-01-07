import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReaderApp {

    // cara close bukan manual

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("nothing.md"))){
            while (true){
                String line = reader.readLine();
                if (line == null) break;
                System.out.println(line);
            }
            System.out.println("FILE SELESAI DIBACA");
        } catch(IOException except){
            System.out.println("FILE GAGAL DIBACA : " + except.getMessage());
        }
    }
}
