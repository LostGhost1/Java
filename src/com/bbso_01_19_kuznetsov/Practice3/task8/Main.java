package com.bbso_01_19_kuznetsov.Practice3.task8;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            String s = null;
            String m= s.toLowerCase();
        }catch (NullPointerException ex){
            System.out.println(ex);
        }
        int[] m = new int[2];
        try {
            m[8] = 5;
        }catch (IndexOutOfBoundsException ex){
            System.out.println(ex);
        }
        ArrayList<String > list = new ArrayList<>();
        try{
            String s = list.get(18);
        }catch (IndexOutOfBoundsException ex){
            System.out.println(ex);
        }
    }
}
