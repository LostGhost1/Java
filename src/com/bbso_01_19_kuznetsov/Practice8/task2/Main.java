package com.bbso_01_19_kuznetsov.Practice8.task2;

public class Main {
    public static void main(String[] args){
        StringBuilder s = new StringBuilder("a");
        new Counter(s).start();
        new Counter(s).start();
        new Counter(s).start();
    }
}
