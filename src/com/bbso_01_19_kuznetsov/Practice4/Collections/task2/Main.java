package com.bbso_01_19_kuznetsov.Practice4.Collections.task2;

import java.util.*;
import java.util.stream.IntStream;

public class Main{
    public static HeavyBox[] Way1(Collection<HeavyBox> boxes){
        return boxes.toArray(new HeavyBox[0]);
    }
    public static HeavyBox[] Way2(Collection<HeavyBox> boxes){
        Object[] objects=boxes.stream().toArray();
        HeavyBox[] heavyBoxes = new HeavyBox[boxes.size()];
        IntStream.range(0, objects.length).forEach(i -> heavyBoxes[i]=(HeavyBox) objects[i]);
        return heavyBoxes;
    }
    public static HeavyBox[] Way3(Collection<HeavyBox> boxes){
        HeavyBox[] result = new HeavyBox[boxes.size()];
        int i=0;
        Iterator<HeavyBox> it = boxes.iterator();
        while(it.hasNext()) {
            result[i]= (HeavyBox) it.next();
            i+=1;
        }
        return result;
    }
    public static void main(String[] args) {
        //Collections является интерфейсом, я буду использовать ArrayList, класс, который эту коллекцию реализовывает
        Collection<HeavyBox> boxes = new ArrayList<>();
        Random r = new Random();
        boxes.add(new HeavyBox());
        boxes.add(new HeavyBox());
        boxes.add(new HeavyBox());
        boxes.forEach(heavyBox -> heavyBox.setWeight(r.nextInt(50)));
        HeavyBox[] boxes1 = Way1(boxes);
        System.out.println("Way 1:");
        for (HeavyBox heavyBox : boxes1) {
            System.out.println("Heavy box of weight "+heavyBox.getWeight());
        }
        HeavyBox[] boxes2 = Way2(boxes);
        System.out.println("Way 2:");
        for (HeavyBox heavyBox : boxes2) {
            System.out.println("Heavy box of weight "+heavyBox.getWeight());
        }
        HeavyBox[] boxes3 = Way3(boxes);
        System.out.println("Way 3:");
        for (HeavyBox heavyBox : boxes3) {
            System.out.println("Heavy box of weight "+heavyBox.getWeight());
        }

    }
}
