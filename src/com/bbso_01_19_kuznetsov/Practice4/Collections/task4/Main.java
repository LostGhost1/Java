package com.bbso_01_19_kuznetsov.Practice4.Collections.task4;


import java.util.*;

public class Main{
    public static void split(Collection<HeavyBox> from, Collection<HeavyBox> to){
        for (Iterator<HeavyBox> iterator = from.iterator(); iterator.hasNext(); ) {
            HeavyBox box = iterator.next();
            if (box.getWeight() > 300) {
                iterator.remove();
                to.add(box);
            }
        }
    }
    public static void main(String[] args) {
        Random r = new Random();
        Collection<HeavyBox> boxes = new ArrayList<>();
        for(int i=0;i<5;i++){
            HeavyBox box = new HeavyBox();
            box.setWeight(r.nextInt(600));
            boxes.add(box);
        }
        Collection<HeavyBox> boxes2= new ArrayList<>();
        split(boxes,boxes2);
        System.out.println("Collection 1:");
        for(HeavyBox box:boxes){
            System.out.println(box.getWeight());
        }
        System.out.println("Collection 2:");
        for(HeavyBox box:boxes2){
            System.out.println(box.getWeight());
        }
    }
}
