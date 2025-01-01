/**
 * - polymorphism berasal dari bahasa Yunani yang berarti banyak bentuk
 * - dalam oop, polymorphism adalah kemampuan sebuah object berubah bentuk menjadi bentuk lain
 * - polymorphism erat hubungannya dengan inheritance
 */

public class Main {
    public static void main(String[] args) {


        Hero hero = new Hero ("Hero", 15);
        hero.info();

        hero = new Assasin("Alucard", 13 );  // tipe datanya tetap hero
        hero.info();
        hero.info();

        hero = new Mage("Eudora", 10);  // tipe datanya tetap hero
        hero.info();



        // kode method polymorphism
        who(new Hero("moonton", 0));
        who(new Assasin("ling", 0));
        who(new Mage("kadita", 0));

    }


    // kode method polymorphism
    static void who (Hero hero) {  // parameter harus parent class
        System.out.println("My name is " + hero.name);
    }
    // tidak perlu lagi capek capek buatkan method satu satu untuk setiap class
}