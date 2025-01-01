package genshin_impact;

public class Chara {
    String name;
    String element;
    int baseAttack;

    public Chara(String name, String element, int baseAttack){
        this.name = name;
        this.element = element;
        this.baseAttack = baseAttack;
    }

    public void sayHello(String name){
        System.out.println("Halo " + name + ", namaku " + this.name);
    }
}
