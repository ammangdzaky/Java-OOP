package ImportStatic;

import static ImportStatic.Waifu2.GENDER;

import static ImportStatic.Waifu2.*; // -> mengimport semua static di class Waifu2

public class Main {
    public static void main(String[] args) {

        System.out.println(GENDER);  // tidak perlu lagi Waifu2.GENDER

        System.out.println(RACE);

        countWaifu("Mikasa", "Tsukasa", "Anju");

        Tsundere nino = new Tsundere();
        nino.name = "Nino Nakano";
        String waifu = nino.name;
        System.out.println(waifu);
    }
}
