public class Mahasiswa {

    String nama;
    String nim;
    String jurusan;

    Mahasiswa (String consNama, String consNim, String consJurusan) {
        nama = consNama;
        nim = consNim;
        jurusan = consJurusan;
    }
    Mahasiswa (String consNama) {
        nama = consNama;
    }
    Mahasiswa (){

    }
    void getInfo(){
        System.out.println("Nama: " + nama);
        System.out.println("Nim: " + nim);
        System.out.println("Jurusan: " + jurusan);
    }
}
