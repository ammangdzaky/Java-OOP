/**
 *
 * - saat membuat kode di dalam block constructor atau method di dalama class, kita bisa menggunakan kata kunci
 * this untuk mengakses object saaat ini
 * - misal kadang kita butuh mengakses sebuah field yang namanya sama dengan parameter method, hal ini tidak bisa langsung dilakukan
 * jika langsung menyebut nama field, kita bisa mengakses nama field tersebut dengan kata kunci this
 * - this juga tidak hanya digunakan untuk mengakses field milik object saat ini, namun juga bisa digunakan untuk mengakses method
 * - this bisa digunakan untuk mengatasi masalah variable shadowing
 *
 */

public class Main {
    public static void main(String[] args) {

        Waifu tsukasa = new Waifu("Tsukasa", 21, "Deredere", "Human");

        tsukasa.sayDarling("DZAKY");
        tsukasa.sayDarling();
    }
}