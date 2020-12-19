package com.bbso_01_19_kuznetsov.Practice4.Collections.task6;

public class Main {
    public static void ILove(Season season){
        switch (season){
            case SUMMER -> System.out.println("I love SUMMER");
            case AUTUMN -> System.out.println("I love AUTUMN");
            case SPRING -> System.out.println("I love SPRING");
            case WINTER -> System.out.println("I love WINTER");
        }
    }
    public static void main(String[] args) {
        Season favourite = Season.SUMMER;
        ILove(favourite);
        for(Season s:Season.values()){
            System.out.println(s);
            s.getDescription();
        }
    }
}
