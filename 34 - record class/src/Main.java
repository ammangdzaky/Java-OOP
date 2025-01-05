/**
 *
 * - kadang kita sering membuat class, hanya untuk class yang berisikan data. Hanya berisi getter/setter, equals, hashCode,
 * dan toString method
 * - record class digunakan untuk mempermudah pembuatan jenis class tersebut
 * - saat kita membuat record class, secara otomatis Java akan membuatkan getter, equals,hashCode, dan toString method secara otomatis,
 * dan juga constructor secara otomatis
 * - saat membuat record class, secara otomatis kita akan meng-extends class java.lang.Record, yang artinya kita tidak bisa extends class lain.
 * Namun kita tetap bisa meng-implement interface
 */

import RecordClass.Person;
import RecordClass.Waifu;

public class Main {
    public static void main(String[] args) {

        Person konsep = new Person("Aimar", 19);

        // getter
        System.out.println(konsep.name());  // bukan konsep.getName()

        // toString otomatis
        System.out.println(konsep);

        // equals otomatis tidak perlu buat manual
        Person dzaky = new Person("Dzaky", 23);
        Person Dzaky = new Person("Dzaky", 23);
        boolean equals = dzaky.equals(Dzaky);
        System.out.println(equals);



        Waifu tsukasa = new Waifu("Tsukasa", "Kuudere");
        Waifu nino = new Waifu("Nino");
        var somebody = new Waifu();

        System.out.println(tsukasa);
        System.out.println(nino);
        System.out.println(somebody);



    }
}