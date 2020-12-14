package com.bbso_01_19_kuznetsov.task4;

public class Main {

    public static void main(String[] args) {
        Cat cat1=Cat.CreateCats();
        Cat.cats.remove(cat1);
        Cat.PrintAllCats();
    }
}
