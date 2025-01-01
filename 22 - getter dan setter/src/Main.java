/**
 * Encapsulation
 * - encapsulation artinya memastikan data sensitif sebuah object tersebunyi dari akses luar
 * - hal ini bertujuan agar kita bisa menjaga agar data sebuah object tetap baik dan valid
 * - untuk mencapai hal ini, biasanya kita membuat semua field menggunakan access modifier private, sehingga tidak bisa
 * diakses atau diubah dari luar
 * - agar bisa diubah, kita akan menyediakan method untuk mengubah dan mendapatkan field tersebut
 *
 *
 * Getter dan Setter
 * - di java, peoses encapsulation sudah dibuat standarisasinya, dimana kita bisa menggunakan getter dan settr method
 * getter adalh function yang dibuat untuk mengambil data field
 * setter adalah function untuk mengubah data field
 *
 * boolean -> getter : isXXX() -> setter : setXXX(boolean value)
 * primitif -> getter : getXXX() -> setter : setXXX(prmitif value)
 * object -> getter : getXXX() -> setter : setXXX(object value)
 *
 * tips getter setter;
 * kan kita harus membuat satu satu getter dan setter untuk setaip field, jadi bayangkan jika fieldnya ada banya misal 1000
 * di intellej, ada generator getter dan setter
 * tekan tanda titik tiga di pojok kiri atas kemudian masuk ke code kemudain generate kemudian getter dan setter
 * code -> generate -> getter and setter
 */


public class Main {
    public static void main(String[] args) {

        Waifu tsukasa = new Waifu("Tsukasa Tsukoyomi", 20, true, "Himedere");

//        System.out.println(tsukasa.name);  -> eror karena private
        System.out.println(tsukasa.getName());
        System.out.println(tsukasa.getType());
        System.out.println(tsukasa.isCanCook());

//        tsukasa.type = "Deredere"; -> ini juga eror karena private
        tsukasa.setType("Deredere");
        System.out.println(tsukasa.getType());

    }
}