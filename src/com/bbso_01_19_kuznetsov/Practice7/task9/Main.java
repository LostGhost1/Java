package com.bbso_01_19_kuznetsov.Practice7.task9;

import java.util.function.Function;

public class Main {
    protected static class Threeof{
        double a,b,c;
        public Threeof(double a, double b, double c){
            this.a=a;
            this.b=b;
            this.c=c;
        }
    }
    public static void main(String[] args) {
        Function<Threeof,Double> disc= threeof -> threeof.b*threeof.b-4*threeof.a*threeof.c;
        System.out.println(disc.apply(new Threeof(2,5,2)));
        System.out.println(disc.apply(new Threeof(2,4,2)));
        System.out.println(disc.apply(new Threeof(2,4,6)));
    }
}