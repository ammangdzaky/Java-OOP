public class Orang {
    String nama;
    int umur;
    String alamat;

    // contoh kasus variable shadowing
    Orang(String nama, int umur, String alamat) {
        nama = nama;
        umur = umur;
        alamat = alamat;
    }
}
