/**
 *
 * - sebelumnya kita sudah tahu bahwa abstract class bisa kita gunakan sebagai kontrak untuk class child nya.
 * - namun sebenarnya yang lebih tepat untuk kontrak adalah interface
 * - jangan salah sangka bahwa interfsce disini bukanlah user interface
 * - interface mirip seperti abstract class, yang membedakan adalah di interface, semua method otomatis abstract, tidak memiliki block
 * - di interface kita tidak boleh memiliki field, kita hanya boleh memiliki constant (field yang tidak bisa diubah)
 * - untuk mewariskan interface, kita tidak menggunakan kata kunci extennds, melainkan implements
 */

public class Main {
    public static void main(String[] args) {

        ClassWaifu anju = new ClassWaifu("Anju Enma", 20, true, "Kuudere");
        System.out.println(anju.GENDER);
//        anju.GENDER = "something"; -> tidak bisa karena field female adalah constant

        System.out.println(anju.name + " sebelum mengenal gwej :  " + anju.type);
        anju.setType("Tsundere");
        System.out.println(anju.name + " setelah mengenal gwej :  " + anju.type);

    }
}