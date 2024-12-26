/**
 *
 * - kadang kita ingin mengakses method yang terdapat di class parent yang sudah terlanjur kita override di class child
 * - untuk mengakses method milik class parent, kita bisa menggunakan kata kunci super
 * - sederhananya, super digunakan untuk mengakses class parent
 * - tidak hanya method, field milik parent class pun kita bisa akses menggunakan kata kunci super
 *
 */

public class Main {
    public static void main(String[] args) {

        Plane plane = new Plane();
        Rectangle rectangle = new Rectangle();

        System.out.println(plane.corners());
        System.out.println(rectangle.corners());

        System.out.println('\n');

        System.out.println(rectangle.getCorners());
        System.out.println(rectangle.getParentCorners());
    }
}