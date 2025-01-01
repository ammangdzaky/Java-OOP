import contoh.DenganToString;
import contoh.TanpaToString;

/**
 * - toString() adalah method yang ada di class object
 * - method ini biasanya digunakan untuk mempresentasikan object dalam bentuk string
 * - secara default, toString() ini menghasilkan:  namaclass + @ + hashcode
 * - namun kita bisa mengubahnya jika kita mau, agar object yang kita buat lebih mudah dibaca
 */

public class Main {
    public static void main(String[] args) {

        DenganToString denganToString = new DenganToString();
        TanpaToString tanpaToString = new TanpaToString();

        System.out.println(denganToString);
        System.out.println(tanpaToString);
    }
}