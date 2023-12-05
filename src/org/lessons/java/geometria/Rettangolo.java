package org.lessons.java.geometria;

public class Rettangolo {
    //ATTRIBUTI
    int base;
    int altezza;

    //COSTRUTTORI
    public Rettangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    //METODI
    int calcolaArea(){
        return base * altezza;
    }
    int calcolaPerimetro(){
        return (base + altezza) * 2;
    }
    String disegna (){
        String newDraw = new String();
        for (int i = 1; i <= base; i++) {
            System.out.print("0");
        }
        System.out.println();
        for (int x = 1; x <= altezza - 2; x++) {
            System.out.print("0");
            for (int i = 1; i <= base - 2; i++) {
                System.out.print(" ");
            }
            System.out.println("0");
        }
        for (int i = 1; i <= base; i++) {
            System.out.print("0");
        }
        return newDraw;

    }
}
