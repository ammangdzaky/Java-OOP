class Plane {

    int corners(){
        return 0;
    }
}

class Rectangle extends Plane{

    int corners(){
        return 4; // method overriding
    }

    int getCorners(){
        return corners();  // mengakses method di class ini (child)
    }

    int getParentCorners() {
        return super.corners();  // mengakses method di class parent
    }
}

