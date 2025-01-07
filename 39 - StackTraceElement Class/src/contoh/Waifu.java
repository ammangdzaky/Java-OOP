package contoh;

public class Waifu {
    public static void main(String[] args) {

        try{
            int zero = 12 / 0;
        } catch (Throwable twb){
            twb.printStackTrace();
        }

//        at contoh.Waifu.main(Waifu.java:7)   -> keterangan letak erornya

        // artinya:   namaPackage.namaClass.namaMethod(namaFile:lineKeBerapa)   -> keterangan letak erornya
    }
}
