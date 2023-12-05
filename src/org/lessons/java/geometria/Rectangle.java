package org.lessons.java.geometria;

public class Rectangle {
    //ATTRIBUTI
    int base;
    int height;


    //COSTRUTTORI


    public Rectangle(int base, int height) {
        this.base = base;
        this.height = height;


    }


    //METODI

    int areaCalculate() {
        return base * height;


    }

    int perimetroCalculate(){
        return 2*(base+height);
    }
}



