package com.bbso_01_19_kuznetsov.Practice3.task7;


import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void RecursiveRead(Scanner sc){
        int i=0;
        try {
            i = sc.nextInt();
        }catch (InputMismatchException e){
            return;
        }
        RecursiveRead(sc);
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RecursiveRead(sc);
    }
}
