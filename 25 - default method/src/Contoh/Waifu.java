package Contoh;

public class Waifu implements WaifuActions{

    String name;
    String type;

    public Waifu (String name, String type){
        this.name = name;
        this.type = type;
    }

    public void sayHelloTo(String name){
        System.out.println("Hello " + name);
    }


    public String move(String direction){
        return this.name + " move " + direction;
    }

    // saya tidak wajib meng-override method sayHello()
}
