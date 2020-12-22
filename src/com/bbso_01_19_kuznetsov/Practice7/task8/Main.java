package com.bbso_01_19_kuznetsov.Practice7.task8;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<HeavyBox> nextbox= ()->new HeavyBox(Math.round(Math.random()*10));
        System.out.println(nextbox.get());
        System.out.println(nextbox.get());
        System.out.println(nextbox.get());
    }
}