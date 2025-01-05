

package RecordClass;

public record Person(String name, int age) {  // parameter disini yaitu field dari class ini dan bersifat final

    // eror
//    public void setUsername(String name){
//        this.name = name;
//    }


}

/**
Hanya dengan satu baris kode, Record class otomatis menyediakan:

Constructor
Getter
toString()
equals()
hashCode()

 coba liat kalau bukan record class di package sebelah
*/