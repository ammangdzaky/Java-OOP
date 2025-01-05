/**

 - saat kita membuat aplikasi, kadang kita akan bertemu dengan jenis-jenis data yang nilainya terbatas
 - misal gender ada male, dan female, atau tipe costumer ada premium, atau vip, dll
 - dalam kasus seperti ini, kita bisa menggunakan enum class, yaitu class yang berisikan nilai terbatas yang sudah ditentukan
 - saat membuat enum class, secara otomatis dia akan meng-extends class.java.lang.Enum, oleh karena itu class enum tidak bisa
 extends class lain, namun masih tetap bisa implements interface

 */

import PERSON.Gender;
import PERSON.Person;

public class Main {
    public static void main(String[] args) {


        Person konsep = new Person("Aimar", 19, Gender.MALE);
        Person ambatron = new Person();
        ambatron.setName("Ambatron");
//        ambatron.setGender(Gender.SKIBIDI);  -> eror
        ambatron.setGender(Gender.MALE);
    }
}