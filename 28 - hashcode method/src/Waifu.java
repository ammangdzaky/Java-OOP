import java.util.Objects;

public class Waifu {

    String name;
    int age;
    String type;

    Waifu(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Waifu waifu = (Waifu) o;
        return age == waifu.age && Objects.equals(name, waifu.name) && Objects.equals(type, waifu.type);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + age;
        result = 31 * result + Objects.hashCode(type);
        return result;
    }
}
