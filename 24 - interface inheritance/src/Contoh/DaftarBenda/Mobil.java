package Contoh.DaftarBenda;

import Contoh.BendaPadat;

public class Mobil implements BendaPadat {

    String name;
    String brand;

    public Mobil(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public void diBakar(){
        System.out.println("mobil " + this.name + " dibakar");
    }
}
