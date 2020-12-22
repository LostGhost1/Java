package com.bbso_01_19_kuznetsov.Practice7.task3;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> passes = s -> (s.charAt(0)=='J' || s.charAt(0)=='N')&& s.charAt(s.length()-1)=='A';
        System.out.println(passes.test("JK"));
        System.out.println(passes.test("AA"));
        System.out.println(passes.test("JA"));
        System.out.println(passes.test("NK"));
        System.out.println(passes.test("NMCA"));
    }
}