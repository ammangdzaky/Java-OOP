/**
 * - sama seperti di method, di constructor pun kita bisa melakukan overloading
 * - kita juga bisa membuat constructor lebih dari satu, dengan syarat tipe data parameter harus berbeda, atau jumlah
 * parameter harus berbeda
 *
 * MEMANGGIL CONSTRUCTOR LAIN
 * - constructor bisa memanggil cosntructor lain
 * - hal ini memudahkan saat kita butuh menginisialisasi data dengan berbagai kemungkinan
 * - cara untuk memanggil cosntructor lain, kita hanya perlu memanggilnya sama seperti memanggil method,
 * namun dengan kata kunci this
 */

public class Main {
    public static void main(String[] args) {

        // KODE : Constructor overloading (mahasiswa.java)
        Mahasiswa dzaky = new Mahasiswa ("Dzaky", "1234","Sistem Informasi" );
        Mahasiswa nahida = new Mahasiswa ("Nahida");
        Mahasiswa yelan = new Mahasiswa ();
        // tidak ada yang menyebabkan eror, meskipun parameternya berbeda-beda

//        Mahasiswa zhongli = new Mahasiswa ("Zhongli", "H12383"); --> ini error karena tidak ada cons dengan dua parameter yg tlah dibuat

        dzaky.getInfo();
        System.out.println('\n');
        nahida.getInfo();
        System.out.println('\n');
        yelan.getInfo();



        // KODE : Constructor panggil constructor (waifu.java)
        Waifu tsukasa = new Waifu("Tsukasa Tsukuyomi", 20, "Deredere");
        Waifu miku = new Waifu ("Miku Nakano", 20);
        Waifu lena = new Waifu ("Vladilena Milize");
        Waifu aqua = new Waifu();

        System.out.println("\n");
        tsukasa.getInfo();
        System.out.println("\n");
        miku.getInfo();
        System.out.println("\n");
        lena.getInfo();
        System.out.println("\n");
        aqua.getInfo();


    }
}