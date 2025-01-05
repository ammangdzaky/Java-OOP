/**
 * - kata kunci final juga bisa digunakan di method
 * - jika sebuah method kita tambah kata kunci final, maka artinya method tersebut tidak bisa dioverride lagi di class childnya
 * - ini sangat cocok jika kita ingin mengunci implementasi dari sebuah method agar tidak bisa diuubah lagi oleh class childnya
 */


public class Main {
    public static void main(String[] args) {

        var mikasa = new Waifu();

        mikasa.name = "Mikasa";

        var tatakae = mikasa.whoDarling("Tatakae");

        System.out.println(tatakae);
    }
}