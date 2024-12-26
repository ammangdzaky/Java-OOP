class CharFf {

    String name;
    String attPower;
    String defPower;

    CharFf (String name, String attPower, String defPower) {
        this.name = name;
        this.attPower = attPower;
        this.defPower = defPower;
    }

    CharFf(){   // -> constoh cons tanpa parameter
        this(null, null, null);
    }
}

class Rusher extends CharFf {

}

/**
 * walapunu saya tidak memanggil cons parent di cj=hild class, maka tidak akan eror karena ada cons di parent class yang
 * tidak memiliki paramter. ini istilahnya default constructor
 */
