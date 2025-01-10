/**
 - annotation adalah menambahkan metadata ke kode program yang kita buat
 - tidak semua orang membutuhkan annotation, biasanya annotation digunakan saat kita ingin membuat library/framework
 - annotation sendiri bisa diakses menggunakan reflection, yang kita bahas nanti
 - untuk membuat annotation, kita bisa menggunakan kata kunci @interface
 - annotation hanya bisa memiliki method dengan tipe data sederhana, dan bisa memiliki default value
 */

/**
 ATTRIBUTE ANNOTATION
 - @Target      : memberitahu annotation bisa digunakan di mana? Class, method, field, dll
 - @Retention   : memberitahu annotation apakah disimpan di hasil kompilasi, dan apakah bisa dibaca oleh reflection?
 */

/**
 Retention Policy:
 - SOURCE: Annotation hanya tersedia di level kode sumber dan diabaikan oleh compiler.
 - CLASS: Annotation disimpan di bytecode tetapi tidak tersedia di runtime.
 - RUNTIME: Annotation tersedia di runtime dan dapat diakses menggunakan refleksi.
 */

/**
 Target:
 - ElementType.TYPE: Untuk kelas, antarmuka, atau enum.
 - ElementType.METHOD: Untuk metode.
 - ElementType.FIELD: Untuk atribut.
 - ElementType.PARAMETER: Untuk parameter metode.
 */

/**
 PREDEFINED ANNOTATION
 Java juga sudah memiliki annotation bawaan, seperti:
 - @Override, untuk menandai bahwa method yang meng-override method parent class-nya
 - @Deprecated, untuk menandai bahwa method tersebut tidak direkomendasikan lagi untuk digunakan
 - @FunctionalInterface, untuk menandai bahwa class tersebut bisa dibuat sebaga lambda expression
 - dll
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}