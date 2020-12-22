package com.bbso_01_19_kuznetsov.Practice7.task6;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer,String> f = n -> (n<0)?"Unsupported":(n>100000000)?"Unsupported":(n<10)?n.toString():(n<100)?n.toString().charAt(0)+"-"+n.toString().charAt(1):(n<1000)?n.toString().charAt(0)+"-"+n.toString().charAt(1)+"-"+n.toString().charAt(2):(n.toString().substring(0,3)+"-"+((n<1000000)?(n.toString().substring(3)):(n.toString().substring(3,6)+"-"+n.toString().substring(6))));
        System.out.println(f.apply(-10));
        System.out.println(f.apply(-1));
        System.out.println(f.apply(0));
        System.out.println(f.apply(1));
        System.out.println(f.apply(10));
        System.out.println(f.apply(100));
        System.out.println(f.apply(1000));
        System.out.println(f.apply(10000));
        System.out.println(f.apply(100000));
        System.out.println(f.apply(1000000));
        System.out.println(f.apply(10000000));
        System.out.println(f.apply(100000000));
        System.out.println(f.apply(1000000000));

    }
}