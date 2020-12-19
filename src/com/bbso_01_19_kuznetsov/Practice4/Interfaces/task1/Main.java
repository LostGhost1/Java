package com.bbso_01_19_kuznetsov.Practice4.Interfaces.task1;

public class Main {
    public static void main(String[] args) {
        Printable[] literature = new Printable[10];
        for(int i=0;i<10;i++){
            literature[i] = (i%2==0)?(new Book("Book "+Integer.toString(i))):(new Magazine("Magazine "+Integer.toString(i)));
        }
        for(int i=0;i<10;i++){
            literature[i].Print();
        }
        Magazine.printMagazines(literature);
        Book.printBooks(literature);
    }
}
