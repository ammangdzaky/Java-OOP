

/**
 * - sebelumnya kita sudah tahu di java, child class hanya bisa punya 1 parent class
 * - namun berbeda dengan interface, sebuah child class bisa implements lebig dari satu interface
 * - bahkan interface pun bisa implements interface lain, bisa lenih dari satu. Namun, jika interface ingin mewarisi interface lain,
 * kita menggunakan kata kunci extends, bukan implements
 */

import Contoh.DaftarBenda.Mobil;
import Contoh.DaftarBenda.Air;

public class Main {
    public static void main(String[] args) {

        Mobil christa = new Mobil ("Christa", "Kijang");
        christa.diBakar();

        Air airLedeng = new Air();
        airLedeng.jenis = "Air ledeng";
        airLedeng.diMasak();
        airLedeng.diBakar();
    }
}