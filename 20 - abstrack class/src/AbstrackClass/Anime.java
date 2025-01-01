package AbstrackClass;

abstract public class Anime {

    public String mainChar;
    public String heroine;
    public String genre;

    public Anime(String mainChar, String heroine, String genre) {
        this.mainChar = mainChar;
        this.heroine = heroine;
        this.genre = genre;
    }

    public void info(){
        System.out.println("Main char  = " + this.mainChar);
        System.out.println("Heroine = " + this.heroine);
        System.out.println("Genre = " + this.genre);
    }
}
