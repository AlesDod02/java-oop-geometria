package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci l'altezza desiderata");
        int userHeight = scanner.nextInt();
        System.out.println("inserisci la base desiderata");
        int userBase = scanner.nextInt();

        Rectangle rettangolo = new Rectangle(userBase, userHeight);
        int areaRettangolo = rettangolo.areaCalculate();

        System.out.println("l'area del tuo rettangolo è:  " + areaRettangolo);
        int perimetroRettangolo = rettangolo.perimetroCalculate();
        System.out.println("il perimetro del tuo rettangolo è:  " + perimetroRettangolo);
        String disegna = rettangolo.printBase();
        System.out.println(disegna);
        scanner.close();

    }
}
