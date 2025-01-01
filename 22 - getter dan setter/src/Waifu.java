public class Waifu {

    private String name;
    private int age;
    private boolean canCook;
    private String type;

    public Waifu(String name, int age, boolean canCook, String type) {
        this.name = name;
        this.age = age;
        this.canCook = canCook;
        this.type = type;
    }

    public String getName(){
        return this.name;
    }

    public String getType(){
        return this.type;
    }

    public boolean isCanCook(){
        return this.canCook;
    }

    public void setType(String type){
        this.type = type;
    }

}
