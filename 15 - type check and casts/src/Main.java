/**
 * - sebelumnya kita sudah tau cara melakukan konversi tipe data (casts) di tipe data primitif
 * - casts juga bisa digunakan untuk tipe data bukan primitif
 * - namun agar aman, debelum melakukan casts, pastikan kita melakukan type check (pengecekan tipe data), dengan
 * menggunakan kata kunci instanceof
 * - hasil operator instanceof adalah boolen, true jika tipe data sesuai dan sebaliknya
 */

class Hero{
    String name;
    Hero (String name){ this.name = name;}
}

class Assasin extends Hero{
    Assasin(String name){
        super(name);
    }
}

class Mage extends Hero{
    Mage (String name){
        super(name);
    }
}




public class Main {
    public static void main(String[] args) {

        Hero heroHero = new Hero("muntun");
        System.out.println(heroHero.getClass().getName());

        heroHero = new Assasin("ling");
        System.out.println(heroHero.getClass().getName());

        heroHero = new Mage("harley");
        System.out.println(heroHero.getClass().getName());

        tes( new Hero("muntun"));
        tes( new Assasin("ling"));
        tes( new Mage("harley"));

    }

    static void tes(Hero heroHero){
        if (heroHero instanceof Hero && !(heroHero instanceof Assasin) && !(heroHero instanceof Mage)){
            Hero hero = (Hero) heroHero;
            System.out.println("Object Hero -> " + hero.name);
        } else if (heroHero instanceof Assasin){
            Assasin assasin = (Assasin) heroHero;
            System.out.println("Object Assasin -> " + assasin.name);
        } else if (heroHero instanceof Mage){
            Mage mage = (Mage) heroHero;
            System.out.println("Object Mage -> " + mage.name);
        }
    }
}


