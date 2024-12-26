class CharMl {

    String name;
    int attPower;
    int defPower;

    CharMl (String name, int attPower, int defPower){
        this.name = name;
        this.attPower = attPower;
        this.defPower = defPower;
    }
}


class Assasin extends CharMl {

    Assasin (String name, int attPower, int defPower){
        super(name, attPower, defPower);
    }

}

/**
 * pada parent class, cons memiliki parameter sehingga ketika saya tidak memanggil parent cons id child class
 * maka akan error
 */
