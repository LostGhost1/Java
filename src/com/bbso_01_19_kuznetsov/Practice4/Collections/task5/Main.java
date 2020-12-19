package com.bbso_01_19_kuznetsov.Practice4.Collections.task5;


import java.util.*;

public class Main{
    public static Set<HeavyBox> union(Set<HeavyBox> set1, Set<HeavyBox> set2){
        Set<HeavyBox> set3 = new HashSet<>(set1);
        set3.addAll(set2);
        return set3;
    }
    public static Set<HeavyBox> intersect(Set<HeavyBox> set1, Set<HeavyBox> set2){
        Set<HeavyBox> set3 = new HashSet<>(set1);
        set3.retainAll(set2);
        return set3;
    }
    public static void main(String[] args) {
        Random r = new Random();
        Set<HeavyBox> boxes1 = new HashSet<>();
        Set<HeavyBox> boxes2 = new HashSet<>();
        for(int i=0;i<10;i++){
            HeavyBox box = new HeavyBox();
            box.setWeight(r.nextInt(15));
            if(!boxes1.add(box))i-=1;
        }
        for(int i=0;i<10;i++){
            HeavyBox box = new HeavyBox();
            box.setWeight(r.nextInt(15));
            if(!boxes2.add(box))i-=1;
        }
        System.out.println("Set1:");
        for(HeavyBox box:boxes1){
            System.out.println(box.getWeight());
        }
        System.out.println("Set2:");
        for(HeavyBox box:boxes2){
            System.out.println(box.getWeight());
        }
        Set<HeavyBox> union = union(boxes1,boxes2);
        System.out.println("union:");
        for(HeavyBox box:union){
            System.out.println(box.getWeight());
        }
        Set<HeavyBox> intersect = intersect(boxes1,boxes2);
        System.out.println("intersect:");
        for(HeavyBox box:intersect){
            System.out.println(box.getWeight());
        }
    }
}
