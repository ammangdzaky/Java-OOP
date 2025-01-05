public class Waifu {

    // field static
    public static final String GENDER = "Female";
    public static final String RACE = "Human";


    // static method
    public static void countWaifu (String... Waifu){
        int count = 1;
        System.out.println("Daftar Waifu : ");
        for (String s : Waifu){
            System.out.println(count + ". " + s);
            count++;
        }
    }

    // static inner class
    public static class Tsundere{
        public static final String TYPE = "Tsundere";
        String name;
        String age;
    }

    // static block -> pertama kali di run ketika class di load
    // Static Block di Java adalah blok kode yang dijalankan hanya satu kali saat kelas dimuat ke dalam memori oleh ClassLoader.
    static {
        System.out.println("Class Waifu dipanggil");
    }

}
