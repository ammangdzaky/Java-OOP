package Contoh;

public interface WaifuActions {

    default void sayHello(){
        System.out.println("Hello");
    }

    void sayHelloTo(String name);

    String move(String direction);
}
