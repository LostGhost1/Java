package com.bbso_01_19_kuznetsov.Practice3.task4;

public class Main {

    public static void main(String[] args) {
        String source="AAAAAAAAAAABBBAAAAAAAAAAAAAACCCAAAA";
        System.out.println(source);
        source = source.replace("BBB","DDD");
        source = source.replace("CCC","DDD");
        System.out.println(source);
        source=source.replace("DDD","");
        System.out.println(source);
    }
}
