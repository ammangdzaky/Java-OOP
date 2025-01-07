/**
 - throwable memiliki method yang bernama getStackTrace(), dimana menghasilkan array dari StackTraceElement object
 - StackTraceElement berisikan informasi tentang class, file bahkan baris lokasi terjadinya error
 - class StackTraceElement ini sangat penting untuk menelusuri lokasikejadian error yang terjadi
 - cara yang paling mudah, kita bisa memanggil method printStackTrace() class Throwable, untuk memprint ke console detail error StackTraceElement-nya
 */

public class Main {
    public static void main(String[] args) {

        try{
            int error = 12 / 0;
        } catch (Throwable twb){
            twb.printStackTrace();
        }

        // output = 	at Main.main(Main.java:12)

        // package.class.method(namafile:line-keberapaErornya)
    }
}