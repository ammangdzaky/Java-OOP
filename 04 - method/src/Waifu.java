public class Waifu {

    String name;
    int age;
    String eyeColor;
    String hairColor;
    String type;
    String[] skill;
    final String gender= "female";

    void sayDarling(int value){
        for (int i = 1; i <= value; i++){
            System.out.println("Aku sayang " + name + " ke-" + i);
        };
    };

    void introduce(){
        System.out.println("Hai sayang, aku " + name);
        System.out.println("Aku berusia "+ age + " tahun");
        System.out.println("Aku memiliki mata berwarna " + eyeColor + " dan rambut berwarna " + hairColor);
    }

    void showSkill(){
        var temp = 1;
        for (String skill : skill){
            System.out.println(temp + ". " + skill);
            temp++;
        };
    };

    public static void main(String[] args) {

        Waifu anju = new Waifu();
        System.out.println(anju.name);

        anju.name = "Anju Emma";
        anju.age = 18;
        anju.eyeColor = "Blue";
        anju.hairColor = "Silvery Blue";
        anju.type = "Oneesan dere";
        anju.skill = new String[] {
                "kemampuan memasak",
                "penembak jarak jauh",
                "perhatian pada orang yang dicintai"
        };

        System.out.println(anju.name);
        System.out.println(anju.age);
        System.out.println(anju.eyeColor);
        System.out.println(anju.hairColor);
        System.out.println(anju.type);
        System.out.println(anju.gender);

        System.out.println(('\n'));
        anju.showSkill();
        System.out.println(('\n'));
        anju.introduce();
        System.out.println('\n');
        anju.sayDarling(5);

    }



}
