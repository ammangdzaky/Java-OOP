import Genshin_Impact.character.Char;
import Genshin_Impact.weapon.Weap;

/**
 * - saat kita membuat aplikasi, bisa dipastikan kita akan banyak sekali membuat class
 * - jika class terlalu banyak, kadang akan menyulitkan kita untuk mencari atau mengklasifikasikan jenis-jenis class
 * - java memiliki fitur package, yaitu mirip folder/directory, dimana kita bisa menyimpan class-class kita di dalam package
 * - sama seperti folder, package juga bisa dinested, kita bisa menggunakan tanda titik (.) untuk membuat nested package
 * - ketika kita menyimpan class di dalam package, maka diatas file java nya, kita wajib menyebutkan nama packagenya
 */


public class Main {
    public static void main(String[] args) {

        Char lisa = new Char("Lisa", "Electro", false);
        Weap tenacity = new Weap(200);

        System.out.println(lisa.getClass().getName());
        System.out.println(tenacity.getClass().getName());
    }
}