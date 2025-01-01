
/**
 * - sebelumnya kita tahu bahwa di interface, kita tidak bisa membuat method kongkkrit yang memiliki block method
 * - namun sejak versi java 8, ada fitur default method di interface
 * - fitur ini terjadi karena sulit untuk maintain kontrak interface jika sudah terlalu banyak class yang implement akan rusak karenaharus meng-override
 * method tersebut
 * - dengan menggunakan default method, kita bisa menambahkan konkrit method di interface
 * - default method tidak wajib di override oleh class turunannya
 */

import Contoh.Waifu;

public class Main {
    public static void main(String[] args) {

        Waifu tsukasa = new Waifu("Tsukasa Tsukoyomi", "Kuudere");
        tsukasa.sayHello();
        tsukasa.sayHelloTo("Dzaky");
        System.out.println(tsukasa.move("Forward"));
    }
}