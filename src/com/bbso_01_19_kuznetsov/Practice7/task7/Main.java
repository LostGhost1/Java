package com.bbso_01_19_kuznetsov.Practice7.task7;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<Long> r = ()->Math.round(Math.random()*10);
        System.out.println(r.get());
        System.out.println(r.get());
        System.out.println(r.get());
    }
}