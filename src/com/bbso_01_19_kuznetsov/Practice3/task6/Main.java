package com.bbso_01_19_kuznetsov.Practice3.task6;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder t = new StringBuilder(s);
        t.reverse();
        System.out.println(t.toString());
    }
}
