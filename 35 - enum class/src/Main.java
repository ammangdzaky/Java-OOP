/**

 - saat kita membuat aplikasi, kadang kita akan bertemu dengan jenis-jenis data yang nilainya terbatas
 - misal gender ada male, dan female, atau tipe costumer ada premium, atau vip, dll
 - dalam kasus seperti ini, kita bisa menggunakan enum class, yaitu class yang berisikan nilai terbatas yang sudah ditentukan
 - saat membuat enum class, secara otomatis dia akan meng-extends class.java.lang.Enum, oleh karena itu class enum tidak bisa
 extends class lain, namun masih tetap bisa implements interface

 */

/**
 - sama seperti class biasanya, di class enum pun kita bisa menambahkan members (field, method, dan constructor)
 - khusus constructor, kita tidak bisa membuat public constructor, karena memang tujuan enum bukan untuk instansiasi secara bebas
 */

import PERSON.Gender;
import PERSON.Person;
import WAIFU.Waifu;
import WAIFU.Type;

public class Main {
    public static void main(String[] args) {

        // package person
        Person konsep = new Person("Aimar", 19, Gender.MALE);
        Person ambatron = new Person();
        ambatron.setName("Ambatron");
//        ambatron.setGender(Gender.SKIBIDI);  -> eror
        ambatron.setGender(Gender.MALE);

        System.out.println(ambatron.getName());
        System.out.println(ambatron.getGender());


        //package waifu
        Waifu mikasa = new Waifu("Mikasa Ackerman", 20, Type.KUUDERE);
        System.out.println(mikasa.getType());
        System.out.println(mikasa.getType().getDescription());


        // KODE: Konversi
        String type = Type.TSUNDERE.name();  // enum ke string
        System.out.println(type.getClass().getName());

        Type type2 = Type.valueOf("DANDERE"); // string ke enum
        System.out.println(type2.getClass().getName());

        // KODE : untuk mengambil semua enum option
        Type[] value = Type.values();

        System.out.println("values:");
        for (Type values : value){
            System.out.println(values);
        }


    }
}