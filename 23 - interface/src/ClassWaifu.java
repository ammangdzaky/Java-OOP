public class ClassWaifu implements Waifu{
    String name;
    int age;
    boolean canCook;
    String type;

    public ClassWaifu(String name, int age, boolean canCook, String type) {
        this.name = name;
        this.age = age;
        this.canCook = canCook;
        this.type = type;
    }

    public void setCanCook(boolean canCook){
        this.canCook = canCook;
    }

    public void setType(String type){
        this.type = type;
    }

}
