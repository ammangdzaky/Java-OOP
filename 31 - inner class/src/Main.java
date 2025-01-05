/**
 * - di Java, kita bisa membuat class di dalam class atau disebut dengan Inner class
 * - salah satu kasus kita membuat inner class biasanya ketika kita butuh membuat beberapa class yang saling berhubungan, dimana
 * sebuah class tidak bisa dibuat tanpa class lain
 * - misal kita perlu membuat class Employee, dimana membutuhkan class Company, maka kita bisa membuat class Employee sebagai inner class Company
 * - cara membuat inner class, cukup membuatnya di dalam block class outer class-nya
 */

public class Main {
    public static void main(String[] args) {

        /**
         *  KEUNTUNGAN MENGGUNAKAN INNER CLASS
         * - keuntungan saat kita membuat inner class adala;h, kemampuan untuk memgkases outer class-nya
         * - inner class bisa membaca semua private class yang ada di outer class-nya
         * - untuk mengakses object outer class-nya, kita bisa menggunakan nama class outer-nya diikuti dengan kata kunci this,
         * misal Anime.this
         * - dan untuk mengakses super class outer class-nya, kita bisa menggunakan nama class outer-nya diikuti dengan kata kunci super, misal Anime.super
         */


        // KODE -> Membuat object dari sautu inner class
        Anime aot = new Anime("Attack on Titan", "Action", true);
        Anime.Waifu mikasa = aot.new Waifu("Mikasa Ackerman", "Kuudere");
        System.out.println(mikasa.animeOrigin);
    }
}