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

    int perimetroCalculate() {
        return 2 * (base + height);
    }

    String printBase() {
        String line = "";
        for (int i = 0; i < base; i++) {
            System.out.print("-");
        }
        System.out.println();

        for (int i = 0; i < height - 2; i++) {
            System.out.print("|");
            for (int f = 0; f < base - 2; f++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
        for (int i = 0; i < base; i++) {
            System.out.print("-");
        }
        return line;
    }
}



