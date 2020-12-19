package com.bbso_01_19_kuznetsov.Practice4.Interfaces.task2;

public class Guitar implements Instrument{
    Integer numberOfStrings;
    @Override
    public void play() {
        System.out.println("Now playing: Guitar with "+numberOfStrings+" strings");
    }
    public Guitar(Integer numberOfStrings){
        this.numberOfStrings = numberOfStrings;
    }
}
