package com.bbso_01_19_kuznetsov.Practice7.task4;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Consumer<HeavyBox> unload = heavyBox -> System.out.println("Unloaded a box of weight "+heavyBox.getWeight());
        Consumer<HeavyBox> send = heavyBox -> System.out.println("Sending a box of weight "+heavyBox.getWeight());
        HeavyBox box = new HeavyBox();
        box.setWeight(50);
        unload.andThen(send).accept(box);
    }
}