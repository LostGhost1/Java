package com.bbso_01_19_kuznetsov.Practice7.task1;

public class Main {
    public static void printbook(){
        System.out.println("book");
    }

    public static void main(String[] args) {
        Printable book = () -> System.out.println("This is a book");
        book.Print();
        Literature something = new Literature(Main::printbook);
        something.WhatIsThis();
    }
}