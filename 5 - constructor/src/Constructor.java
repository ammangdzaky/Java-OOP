/**
 *
 * - saat kita membuat object, maka kita seperti memanggil sebuah method, karena kita menggunakan kurung ()
 * - di dalam class java, kita bisa membuat constructor, constructor adalah method yang akan dipanggil saat pertama kali
 * object dibuat
 * - mirip seperti di method, kita bisa memberi parameter pada constructor
 * - nama constructor harus sama dengan nama class, dan tidak membutuhkan kata kunci void atau return value
 */

public class Constructor {
    public static void main(String[] args) {

        WaifuWithoutConstructor mikasa = new WaifuWithoutConstructor();
        mikasa.name = "Mikasa Ackerman";
        mikasa.age = 20;
        mikasa.eyeColor  = "Grey";
        mikasa.hairColor = "Black";
        System.out.println(mikasa.name);

        WaifuWithConstructor kurome = new WaifuWithConstructor("Kurome", 15, "Black", "Black" );
        // tidak perlu ini lagi
//        kurome.name = "Mikasa Ackerman";
//        kurome.age = 20;
//        kurome.eyeColor  = "Grey";
//        kurome.hairColor = "Black";
        System.out.println(kurome.name);
    }
}