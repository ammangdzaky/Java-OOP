public class Waifu {

    String name;
    Integer age;
    String type;

    // cons 1
    Waifu (String consName, Integer consAge, String consType) {
        name = consName;
        age = consAge;
        type = consType;
    }

    // cons 2
    Waifu (String consName, Integer consAge){
        this(consName, consAge, null);   // -> null artinya menghilangkan parameternya/mengosongkan (kan tadi 3, skrang tinggal 2)
//        tidak perlu lagi ketik:
//        name = consName;
//        age = consAge;
    }

    // cons 3
    Waifu (String consName){
        this(consName,null);
    }

    // cons 4
    Waifu () {
        this(null);
    }

    void getInfo(){
        System.out.print("Name: " + name + ", ");
        System.out.print("Age: " + age + ", ");
        System.out.print("Type: " + type);
    }

}
