package com.bbso_01_19_kuznetsov.Practice3.task5;

public class Main {

    public static void main(String[] args) {
        String source="SomethingMeaninglessLikeHigherEducation";
        StringBuilder t = new StringBuilder(source);
        System.out.println(source);
        for(int i=0;i<source.length();i++){
            t.setCharAt(i,(i%2==0)?(Character.toUpperCase(source.charAt(i))):(Character.toLowerCase(source.charAt(i))));
        }
        System.out.println(t.toString());
        System.out.println((t.toString().compareTo(source)<0)?"less":((t.toString().compareTo(source)>0)?"greater":"equal"));
    }
}
