/**
 * - anonymous class atau class tanpa nama
 * - adalah kemampuan mendeklarasikan class, sekaligus meng-intansiasi object-nya secara langsung
 * - anonymous class sebenarnya termasuk inner class, dimana outer class-nya adalah tempat dimana kita membuat anonymous class tersebut
 * - anonymous class sangat cocook ketika kita berhadapan dengan kasus implementasi interface atau abstrack class sederhana, tanpa
 * harus membuat implementasi class-nya
 * - kekurangan dari anonymous class yaitu tidak bisa di reuse
 */

public class Main {
    public static void main(String[] args) {

        // KODE : Menggunakan anonymous class

        Waifu mikasa = new Waifu(){   // anonymous class (interface tidak bisa diimplmentasikan)
            public void introduce(String name){
                System.out.println("Hai darling, I'm " + name);
            }

        };
        // tidak bisa reuse (makanya kasusnya biasanya digunakan pada hal sederhana saja)
        Waifu christa = new Waifu(){
            public void introduce(String name){
                System.out.println("Hai darling, I'm " + name);
            }
        };

//        Waifu somebody = new Waifu();  -> eror

        mikasa.introduce("Mikasa");
        christa.introduce("Christa");
    }
}