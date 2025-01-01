/**
 * - access modifier adalah kemampuan class, field, method, dan constructor dapat diakses dari mana saja
 * - sebemunya kita sudah melihat 2 access modifier, yaitu public dan default (no-modifier)
 * - sekarang kita bahas access modifier lainnya
 *
 * - saat kita membuat public class, kita hanya bisa membuat 1 public class di 1 file java
 * - selain itu, nsms public class harus sama dengan nama file
 */


import MobileLegend.hero.Hero;

public class Main {
    public static void main(String[] args) {

        Hero karina = new Hero ("karina",100,20);
//        karina.name = name; eror karena String nsme diset ke protected (tidak bisa diakses di luar mpackage

    }
}
