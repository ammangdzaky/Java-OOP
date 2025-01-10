package contoh_predefined_annotation;

public interface Action {

    void walk();
    void run();

    @Deprecated
    void sleep();  // artinya method sleep tidak direkomendasikan
}
