/**
 - error adalah jenis exception yang terakhir
 - error adalah sebuah class di java, yang tidak direkomendasikan untuk di try-catch
 - biasanya error terjadi ketika ada masalah serius, dan sangat tidak direkomendasikan untuk di try-catch
 - artinya, direkomendasikan untuk mematikan aplikasi
 - contoh, misal jika diawal aplikasi kita tidak bisa terkoneksi dengan database, direkomendasikan untuk membuat exception jenis Error, dan menghentikan aplikasi
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}