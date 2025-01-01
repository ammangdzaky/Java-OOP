/**
 * - import adalah kemampuan untuk mengguanakn class yang berbeda di package yang berbeda
 * - syarat class yang bisa digunakan jika packagenya berbeda adalah class yang harus public
 * - jika kita ingin mengimport semua class di dalam sebuah package, kita bisa menggunakan tanda *
 * - misal : import Hero.* (semua class di dalam package Hero akan diimport
 *
 * - secara default, semua class yang ada di package java.lang sudah auto import, jadi kita tidak perlu melakukan import secara manual
 * - contoh class String, Integer, Long, Boolean, dll terdapat di package java.lang. Oleh karena itu,
 * kita tidak perlu meng-import nya secara manual
 */


import genshin_impact.*;
//tidak perlu lagi
//import genshin_impact.Character;
//import genshin_impact.Weapon;

public class Main {
    public static void main(String[] args) {

        Chara nahida = new Chara("Nahida","Dendro", 100);
        nahida.sayHello("Asep");

        Weapon ironBlade = new Weapon();
        System.out.println(ironBlade.name);
        System.out.println(ironBlade.power);

    }
}