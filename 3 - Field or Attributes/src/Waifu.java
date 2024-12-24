/**
 *
 * - field yang ada di object, bisa kita manipulasi (mengambil, mengubah, dll). Tergantu final atau bukan
 * - jika final, berarti kita tidak bisa mengubah data field nya, namun jika tidak, kita bisa mengubah field nya.
 * - untuk memanipulasi data field, sama seperti cara pada variable
 * - untuk mengakses field, kita butuh kata kunci . (titik) setelah nama object dan diikuti nama fields nya
 *
 */

public class Waifu {
    // menambhkan field/attributes
    String name;
    int age;
    String[] skill;
    final String gender = "Female";  // --> artinya field ini sudah final/tidak bisa diubah
    final String race = "Human";

    public static void main(String[] args) {

        Waifu waifu = new Waifu();

        waifu.name = "Tsukasa Tsukuyomi";
        waifu.age = 25;
        waifu.skill =  new String[] {
                "keterampilan rumah tangga",
                "pengetahuan sejarah dan budaya",
                "kemampuan fisik yang luar biasa",
                "kemampuan bertarung",
                "penyayang dan penuh kasih"
        };
//        waifu.race = "elf"; akan menghasilkan eror karena field race sudah final

        System.out.println(waifu.name);
        System.out.println(waifu.age);
        System.out.println(waifu.gender);
        System.out.println(waifu.race);

        System.out.println("skill " + waifu.name + ":");
        for (String skill : waifu.skill){
            System.out.println(skill);
        }
    }
}
