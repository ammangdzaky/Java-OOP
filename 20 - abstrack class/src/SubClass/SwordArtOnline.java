package SubClass;

import AbstrackClass.Anime;

public class SwordArtOnline extends Anime{

    public SwordArtOnline(String mainChar, String heroine, String genre ){
        super(mainChar, heroine, genre);
    }

    public SwordArtOnline(){
        super(null,null,null);
    }
}