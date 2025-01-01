package genshin_impact;

public class Weapon {
    public String name;
    public int power;

    public Weapon(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public Weapon(){
        this.name = null;
        this.power = 0;
    }
}
