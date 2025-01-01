/**
 * - method hashcode adalah method representasi integer object kita, mirip toString yang merupakan representasi String, hashCode
 * adalah representasi integer
 * - hashcode sangat bermanfaat untuk membuat struktur data unique seperti hashMap, Set, dan lain-lain, karena cukup menggunakan hashCode
 * method untuk mendapatkan identitas unique object kita
 * - secara default hashCode akab mengembalikan nilai integer sesuai data di memory, namun kita bisa mengoverride jika kita ingin
 */

/**
 * Tidak mudah meng-override method hashCode, karena ada kontraknya:
 * - seanyak apapun hashCode dipanggil, untuk object yang sama, harus menghasilkan data integer yang sama
 * - jika ada 2 object yang sama jika dibandingkan menggunakan method equals, maka nilai hashcode-nya juga harus sama
 * - tidak wajib hashcode berbeda jika method equals menghasilkan false, karena memang keterbatasan jumalh integer sekitar 2 miliyar
 */

public class Main {
    public static void main(String[] args) {

        Waifu anju = new Waifu("Anju Enma", 20, "Deredere");
        Waifu anju2 = new Waifu("Anju Enma", 20, "Deredere");
        Waifu lena = new Waifu("Vladilena", 20, "Himedere");

        boolean resultFalse = anju.hashCode() == lena.hashCode();
        boolean resultTrue = anju.hashCode() == anju2.hashCode();

        System.out.println(resultFalse);
        System.out.println(resultTrue);
    }
}