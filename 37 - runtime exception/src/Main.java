/**
 Jenis Exception

 - checked exception, yaitu exception yang wajib di try catch, seperti yang sudah kita bahsas sebelumnya
 - runtime exception, dan
 - error (yang kita bahas di materi sebelumnya)
 */

/**
 RUNTIME EXCEPTION

 - runtime exception adalah jenis exception yang tidak wajib ditangkap menggunakan try catch
 - kompiler java tidak akan protes walaupun kita tidak menggunakan try catch ketika kita memanggil method yang bisa menyebabkan runtime exception
 - untuk membuat class runtime exception, kita wajib menge-extends class RuntimeException
 - ada banyak di java yang merupakan runtime exception, seperti NullPointerException, IllegalArgumentException, dan lain-lain
 - runtime exception tidak wajib menggunakan throws keyword
 */

/**
 PERLU DIPERHATIKAN
 - walaupun runtime exception tidak wajib di try-catch, tapi ada baiknya tetap melakukan try-catch
 - karena jika terjadi runtime exception, yang ditakutkan adalah programnya berhenti
 */


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}