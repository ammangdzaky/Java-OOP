package Contoh.DaftarBenda;

import Contoh.BendaCair;
import Contoh.BendaPadat;

public class Air implements BendaPadat, BendaCair {

    public String jenis;

    public void diBakar() {
        System.out.println("dapat dibakar ketika menjadi es batu (mungkin)");
    }

    public void diMasak() {
        System.out.println("dimasak untuk jadi air minum");
    }
}
