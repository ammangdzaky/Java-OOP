/**

 Record class constructor

 - secara default, constructor di record class akan dibuat secara otomatis, sesuai dengan definisi record class parameter
 - namun jika kita ingin melakukan sesuatu di constructor tersebut, kita bisa membuat compact constructro, yaitu constructor tanpa tanda()
 - selain itu, kita juga bisa melakukan constructor overloading, namun ada syaratnya, yaitu constructor overloading-nya harus tetap
 memanggil constructor utama yang secara otomatis dibuatkan di record class


 */

package RecordClass;

public record Waifu(String name, String type) {

    public Waifu {
        System.out.println("Membuat object class waifu");
    }

    // overrading cons
    public Waifu(String name){
        this(name, "Tsundere");
    }

    public Waifu(){
        this(null,null);
    }
}
