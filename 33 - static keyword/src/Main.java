/**
 *
 * _ Sebelumnya kita sudah sering melihat kata kunci static, namun belum pernah kita bahas
 * - dengan menggunakan kata kunci static, kita bisa membuat field, method, atau class bisa diakses langsung tanpa melalui objectnya
 * - perlu diingat, static hanya bisa mengakses static lainnya
 *
 * STATIC DAPAT DIGUNAKAN DI:
 * - field, atau disebut variable class, artinya field tersebut bisa diakses langsung tanpa membuat objet terlebih dahulu
 * - method, atau disebut method class, artinya method tersebut bisa diakses langsung tanpa membuat objet terlebih dahulu
 * - block, static block akan otomatis dieksekusi ketika sebuah class di load
 * - inner class, artinya inner class tersebut bisa diakses secara langsung tanpa harus membuat object outer class terlebih dahulu. Static pada inner class menyebabkan
 * kita tidak bisa mengakses lagi object outer class-nya
 */

public class Main {
    public static void main(String[] args) {

        // memanggil field static
        System.out.println(Waifu.GENDER); // saya tidak perlu membuat object class waifu untuk menagkses field class waifu
        // memanggil method static
        Waifu.countWaifu("Tsukasa", "Mikasa", "Anju", "Lena", "Kurome");

        // memanggil inner class static
        Waifu.Tsundere nino = new Waifu.Tsundere(); // tidak perlu lagi membuat object dari outer class-nya (cek materi inner class)
        nino.name = "Nino Nakano";
        System.out.println(nino.name);

    }
}