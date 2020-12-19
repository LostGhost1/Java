package com.bbso_01_19_kuznetsov.Practice4.Interfaces.task1;

public class Book implements Printable{
    public static void printBooks(Printable[] literature){
        for (Printable printable : literature) {
            if (printable instanceof Book) printable.Print();
        }
    }
    public String Title;
    public Book(String Title){
        this.Title=Title;
    }

    @Override
    public void Print() {
        System.out.println("This book's title is "+Title);
    }
}
