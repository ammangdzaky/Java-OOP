/**
 *
 * - method overriding adalah kemampuan mendeklarasikan ulang method di child class, yang sudah ada di parent class
 * - saat kita melakukan proses overriding tersebut, secara otomatis ketika kita membuat object dari class child, method yang yang ada di class
 * parent tidak bisa diakses lagi
 *
 */

public class Main {
    public static void main(String[] args) {


        Hero lapu2MinotaurNatalia = new Hero();

        Mage harley = new Mage();
        harley.name = "Harley";
        harley.demeg = 200;
        harley.level = 10;

        lapu2MinotaurNatalia.info();
        System.out.println('\n');
        harley.info();
        // walaupun mage merupakan child class dari hero, tetapi terjadi overriding method sehingga walapun nama
        // methodnya sama, tetapi outputnya berbeda
    }
}