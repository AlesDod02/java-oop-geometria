package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("inserisci l'altezza desiderata");
        int userHeight = scanner.nextInt();
        System.out.println("inserisci la base desiderata");
        int userBase = scanner.nextInt();

        Rectangle rettangolo =  new Rectangle(userBase,userHeight);

        System.out.println("l'area del tuo rettangolo è:  "+ rettangolo.areaCalculate());
        System.out.println("il perimetro del tuo rettangolo è:  "+ rettangolo.perimetroCalculate());
        String disegna = rettangolo.printBase();
        System.out.println(disegna);
        /*String heightline = rettangolo.printHeight();
        System.out.println(heightline);
        String baseline2 = rettangolo.printBase();
        System.out.println(baseline2);*/
    }
}
