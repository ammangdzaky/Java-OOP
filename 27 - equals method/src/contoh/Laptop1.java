package contoh;

import java.util.Objects;

public class Laptop1 {

    String name;
    String cpu;
    int ram;

    public Laptop1(String name, String cpu, int ram) {
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
    }

    // override equals method
    public boolean equals(Object other){
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;  // intinya jika obeject null dan class object tidak sama maka return false

        Laptop1 laptop = (Laptop1) other;
        return name.equals(laptop.name) && cpu.equals(laptop.cpu) && ram == laptop.ram;
        // == untuk membandingkan primitif (misal int) dan equals() untuk membandingkan object(misal string)

    }
}
