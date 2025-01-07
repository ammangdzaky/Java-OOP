/**
 - saat kita membuat aplikasi, kita tidak akan terhindar dengan yang namanya eror
 - di java, eror direpresentasikan dengan istilah exception, dan semua direpresentasikan dalam bentuk class exceprion
 - kita bisa menggunakan class exception sendiri, atau menggunakan yang sudah disediakan oleh java
 - jika kita ingin membuat exception, maka kita harus membuat class yang extends class Exception atau turunan-turunannya
 */

/**
 - exception biasanya terjadi di method, ketika kita membuat exception di sebuah method, maka method tersebut harus ditandai dengan
 kata kunci throw diikuti dengan class exceptionnya.
 - jika method tersebut bisa menimbulkan lebih dari satu jenis exception, kita bisa menambaj lebih dari satu class exception
 - di dalam kode program kita, untuk membuat exception kita cukup menggunakan kata kunci throw, diikuti dengan object exception-nya
 */

/**
 FINALLY KEYWORD

 - dalam try-catch, kita bisa menambakan block finally
 - block finally ini adalah block dimana akan selalu dieksekusi baik terjadi exception ataupun tidak
 - ini sangat cocok ketika kita ingin melakukan sesuatu, tidak pesuli sukses atau gagal, misal di block try kita ingin membaca file, di block catch
 kita akan tangkap jika terjadi eror, dan di bllovk finally error ataupun sukses membaca file, kita waji menutup koneksi ke file tersebut, biar
 tidak menggantung di memory
 */


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}