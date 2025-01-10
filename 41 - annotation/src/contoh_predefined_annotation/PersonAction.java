package contoh_predefined_annotation;

public class PersonAction implements Action{

    String name;

    @Override
    public void run() {
        System.out.println(this.name + " run");
    }

    @Override
    public void walk() {
        System.out.println(this.name + " walk");
    }

    @Override
    public void sleep() {
        System.out.println(this.name + " sleep");
    }

}
