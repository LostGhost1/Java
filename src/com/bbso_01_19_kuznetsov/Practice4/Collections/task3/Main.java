package com.bbso_01_19_kuznetsov.Practice4.Collections.task3;


import java.util.Random;
import java.util.TreeSet;

public class Main{

    public static void main(String[] args) {
        Random r = new Random();
        TreeSet<HeavyBox> boxes = new TreeSet<>();
        for(int i=0;i<5;i++){
            boxes.add(new HeavyBox());
            boxes.last().setWeight(r.nextInt(50));
        }
        for(HeavyBox box:boxes){
            System.out.println(box.getWeight());
        }
    }
}
