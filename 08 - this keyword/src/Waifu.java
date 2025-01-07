public class Waifu {

    String name;
    int age;
    String type;
    String race;

    // membuat constructor

    Waifu (String name, int age, String type, String race) {
//        name = name -> variable shadowing
        this.name = name;
        this.age = age;
        this.type = type;
        this.race = race;
    }

    void sayDarling(){
        this.sayDarling("Dzaky");
    }

    void sayDarling(String name) {
        System.out.println("Hai " + name + " sayang, saya " + this.name);
    }
}
