class Hero {
    String name;
    void info(){
        System.out.println("Hero info -> " + name );
    }
}

class Assasin extends Hero {
    String name;
    void info(){
        System.out.println("Assasin info -> " + super.name);
    }
}
