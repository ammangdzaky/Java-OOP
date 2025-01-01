/**
 * - saat kita membuat class yang asbtrack, kitsa bisa membuat abstrack method juga di dalam clas abstract tersebut
 * - saat kita membuat abstrack method, kita tidak boleh membuat block method untuk method tersebut (metho harus kosong)
 * - artinya, abstrack method wajib di override di class child
 * - abstrack method tidak boleh memiliki access modifier private
 */


public class Main {
    public static void main(String[] args) {

        MobileLegend harley = new Assasin();
        harley.name = "Harley";
        harley.attack("Layla");

    }
}