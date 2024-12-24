class WaifuWithoutConstructor {

    String name;
    int age;
    String hairColor;
    String eyeColor;

    public static void main(String[] args) {

        WaifuWithoutConstructor tsukasa = new WaifuWithoutConstructor();
        tsukasa.name = "Tsukasa Tsukuyomi";
        tsukasa.age = 18;
        tsukasa.eyeColor = "Red";
        tsukasa.hairColor = "Red";

        System.out.println(tsukasa.name);
        System.out.println(tsukasa.age);
        System.out.println(tsukasa.eyeColor);
        System.out.println(tsukasa.hairColor);

    }
}
