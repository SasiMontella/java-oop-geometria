package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci il valore della base del rettangolo: ");
        int userBase = scan.nextInt();

        System.out.print("Inserisci il valore dell'altezza del rettangolo: ");
        int userAltezza = scan.nextInt();

        Rettangolo rettangolo = new Rettangolo(userBase, userAltezza);

        System.out.println("Il perimetro del rettangolo è " + rettangolo.calcolaPerimetro());
        System.out.println("L'area del rettangolo è " + rettangolo.calcolaArea());
        System.out.println(rettangolo.disegna());

        scan.close();
    }
}
