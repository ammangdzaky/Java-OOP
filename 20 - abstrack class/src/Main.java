/**
 * - saat kita membuat class, kita bisa menjadikan sebuah class sebagai abstrack class
 * - abstrack class artinya, class tersebut tidak bisa dibuat sebagai object secara langsung, hanya bisa diturunkan
 * - untuk membuat sebuah class menjadi abstrack, kita bisa menggunakan kata kunci abstrack sebelum kata kunci class
 * - dengan demikian absstrack class bisa kita gunakan sebagai kontrak untuk class child
 */

import AbstrackClass.*;
import SubClass.*;

public class Main {
    public static void main(String[] args) {

//        Anime anime = new Anime("jokowi", "megawati", "drama") -> eror karena anime adalah abstrack class

        SwordArtOnline sao = new SwordArtOnline("Kiritod","Asuna","Action");
        sao.info();

        SwordArtOnline saoV2 = new SwordArtOnline();
        saoV2.mainChar = "Ustad Kiritod";
        saoV2.heroine = "tidak ada, stay halal";
        saoV2.genre = "Slice of Life";
        saoV2.info();



    }
}