/**
 *
 * - variable hiding merupakan masalah yang terjadi ketika kita membuat nama field sama di class child dengan nama field di class parent
 * - tidak ada yang namanya field overriding, ketika kita buat ulang nama field di class class, itu berarti variable hiding
 * - untuk mengatasi variable hiding, caranya kita bisa menggunakan suoer keyword
 * - yang membedakan variable hiding dan method overriding adalah ketika sebuah object di casts
 * - saat object di casts, method akan tetap mengakses method overriding, namun variable akan mengakses variable yang ada di class nya

 */

public class Main {
    public static void main(String[] args) {

        Assasin heroAssasin = new Assasin();
        heroAssasin.name = "lance";
        System.out.println(heroAssasin.name);
        heroAssasin.info();

        // coba kita casting
        Hero hero = (Hero) heroAssasin;
        System.out.println(hero.name);
        hero.info();
    }
}