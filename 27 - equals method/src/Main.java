import contoh.Laptop1;
import contoh.Laptop2;

/**
 * - hal yang membingungkan di java adalah cara membandingkan object
 * - di bahsa lain, untuk mengecak apakah sebuah object sama, biasanya menggunakan operator ==, di Java,
 * operator == hanya untuk mengecek data primitif
 * - untuk non primitif pengecekannya menggunakan method equals
 * - dan secara default, method equals itu akan membandingkan dua buah object secara kesamaan posisi object di memory, artinya jika
 * kita membuat 2 object yang isi fielnya sama, tetap dianggap beda oleh method equals
 * - oleh karena itu, ada baiknya kita meng-override method equals milik class object tersebut
 *
 * tips:
 *   dengan menggunakan intelej, kita bisa generate override method equals
 *   titik tiga di kanan atas -> generate(atau alt + insert) -> hashCode and Equals
 */


public class Main {
    public static void main(String[] args) {

        // sudah override method equals
        Laptop1 workplus1 = new Laptop1("workplus", "ryzen 7", 16);
        Laptop1 workplus2 = new Laptop1("workplus", "ryzen 7", 16);

        // sudah override method equals
        System.out.println(workplus1.equals(workplus2));
        System.out.println(workplus2.equals(workplus1));


        // harusnya sama kan


        // belum override method equals
        Laptop2 asus1 = new Laptop2("asus", "ryzen 7", 16);
        Laptop2 asus2 = new Laptop2("asus", "ryzen 7", 16);

        // belum override method equals
        System.out.println(asus1.equals(asus2));
        System.out.println(asus2.equals(asus1));




    }
}