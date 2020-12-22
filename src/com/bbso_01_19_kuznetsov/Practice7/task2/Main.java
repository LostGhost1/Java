package com.bbso_01_19_kuznetsov.Practice7.task2;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> isnull = (str)->str==null;
        Predicate<String> isempty = (str) ->((str==null) || (str.isEmpty()));
        String s = null;
        System.out.println(isempty.negate().and(isnull.negate()).test(s)?"Not empty and not null":"Empty or null");
        s = "";
        System.out.println(isempty.negate().and(isnull.negate()).test(s)?"Not empty and not null":"Empty or null");
        s="abc";
        System.out.println(isempty.negate().and(isnull.negate()).test(s)?"Not empty and not null":"Empty or null");
    }
}