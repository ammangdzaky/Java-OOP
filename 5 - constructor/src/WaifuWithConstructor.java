class WaifuWithConstructor {

    String name;
    int age;
    String hairColor;
    String eyeColor;

    // Membuat constructor
    WaifuWithConstructor(String consName, int consAge, String consHairColor, String consEyeColor){
        name = consName;
        age = consAge;
        hairColor = consHairColor;
        eyeColor = consEyeColor;
    }


    // method tanpa constructor
    void sayHello(){
        System.out.println(name + " say hello");
    }

    // method dengan constructor
    void sayDarling(String consName){
        System.out.println("Hai sayang, aku " + consName);
    }


    public static void main(String[] args) {

        WaifuWithConstructor miku = new WaifuWithConstructor("Miku Nakano", 18, "Red", "Pink");

//        tidak perlu lagi untuk menginisialisasi fieldnya satu satu seperti:
//        miku.name = "Miku Nakano";
//        dst

        System.out.println(miku.name);
        System.out.println(miku.age);
        System.out.println(miku.hairColor);
        System.out.println(miku.eyeColor);

        //method tanpa cosntructor
        // -> parameternya tidak bisa diubah
        miku.sayHello();
//        miku.sayHello("Emelia"); -> eror

        //method dengan constructor
        // -> parameternya bisa diuubah
        miku.sayDarling(miku.name);
        miku.sayDarling("Emelia");
    }
}
