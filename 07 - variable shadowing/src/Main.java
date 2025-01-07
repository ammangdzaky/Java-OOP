/**
 * - variable shadowing adalah kejadian ketika kita membuat nama variable dengan nama yang sama di scope yang menutupi variable
 * dengan na,a yang sama di scope diatasnya
 * - ini biasa terjadi seperti kita membuat nama parameter di method sama dengan nama field di class
 * - saat terjadi variable shadowing, maka secara otomatis variable di scope diatasnya tidak bisa diakses
 */

public class Main {
    public static void main(String[] args) {

        Orang kratos = new Orang("Kratos", 200, "Yunani");
        System.out.println(kratos.nama);
        System.out.println(kratos.umur);
        System.out.println(kratos.alamat);
    }
}