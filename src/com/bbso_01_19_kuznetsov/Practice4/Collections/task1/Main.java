package com.bbso_01_19_kuznetsov.Practice4.Collections.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //В Java нет динамических массивов, воспользуюсь обычными массивами
        HeavyBox[] boxes = new HeavyBox[10];
        for (int i = 0, boxesLength = boxes.length; i < boxesLength; i++) {
           boxes[i] = new HeavyBox();
           boxes[i].setWeight(i);
        }
        for(HeavyBox box:boxes){
            System.out.println("This box's weight is "+box.getWeight());
        }
        boxes[0].setWeight(1);
        boxes= Arrays.copyOf(boxes,boxes.length-1);
        boxes= Arrays.copyOf(boxes,0);
    }
}
