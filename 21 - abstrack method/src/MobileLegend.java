public abstract class MobileLegend {

    public String name;
    public int attPower;
    public int defPower;

    public abstract void attack(String enemy);  //memaksa semua child turunannya untuk mempunyai method attack
}
