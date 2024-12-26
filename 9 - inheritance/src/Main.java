/**
 *
 * - inheritance atau pewarisan adalah kemampuan untuk menurunkan sebuah class ke class lain
 * - dalam artian, kita bisa membuat class Parent dan class child
 * - class child, hanya bisa punya satu class parent, namun satu class parent bisa punya banyak class child
 * - saat sebuah class diturunkan, maka semua field dan method yang ada di class parent, secara otomatis akan dimiliki oleh class child
 * - untuk melakukan pewarisan, di class child, kita harus menggunakan kata kunci extands lalu diikuti dengan nama class parentnya
 *
 */


public class Main {
    public static void main(String[] args) {

        // coba cek class assasin, pasti kodenya kosong karena kodenya diwariskan dari class hero
        var harley = new Assasin();
        harley.name = "Harley";
        harley.attackPower = 120;
        harley.defensePower = 20;

        var attack = harley.attack("Miya");
        System.out.println(attack);
    }
}