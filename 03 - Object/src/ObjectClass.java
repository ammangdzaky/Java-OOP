import org.w3c.dom.ls.LSOutput;

/**
 * - object adalah hasil instansiasi dari sebuah class
 * - untuk membuat objectkita bisa menggunakan kata kunci new, dan diikuti dengan nama Class dan kurung()
 */

class ObjectClass {

    // buat object diluar main class
    ObjectClass firstObject = new ObjectClass();  // deklarasi dan inisialisasi
    ObjectClass secondObject;                     // deklarasi
    public ObjectClass() {
        secondObject = new ObjectClass();         // inisialisasi
    }


    // buat object didalam main class
    public static void main(String[] args) {

        // deklarasi dan inisialisasi object
        var firstObject = new ObjectClass();
        ObjectClass secondObject = new ObjectClass();
        ObjectClass thirdObject;
        thirdObject = new ObjectClass();

        System.out.println(firstObject);
        System.out.println(secondObject);
        System.out.println(thirdObject);
    }
}