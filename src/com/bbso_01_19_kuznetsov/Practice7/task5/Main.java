package com.bbso_01_19_kuznetsov.Practice7.task5;
import com.bbso_01_19_kuznetsov.Practice7.task4.HeavyBox;

import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer,String> f = number -> (number>0)?"Positive":(number<0)?"Negative":"Zero";
        System.out.println(f.apply(3));
        System.out.println(f.apply(-2));
        System.out.println(f.apply(0));
    }
}