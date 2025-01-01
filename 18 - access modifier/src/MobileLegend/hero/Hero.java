package MobileLegend.hero;

public class Hero {
    protected String name;
    protected int attPower;
    protected int defPower;

    public Hero(String name, int attPower, int defPower) {
        this.name = name;
        this.attPower = attPower;
        this.defPower = defPower;
    }

    public Hero(){
        this.name = null;
        this.attPower = 0;
        this.defPower = 0;
    }

    private void changeName(String name){
        this.name = name;
    }


}

class Main extends Hero{

    Main(String name, int attPower, int defPower) {
        super(name, attPower, defPower);
    }

    public static void main(String[] args) {
        Hero alu = new Hero ("alucard", 100, 50);
//        alu.changeName("karina");  -> eror karena changeName() private

    }
}
