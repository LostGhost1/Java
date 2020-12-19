package com.bbso_01_19_kuznetsov.Practice4.Interfaces.task2;

public class Tube implements Instrument{
    Integer diameter;
    @Override
    public void play() {
        System.out.println("Now playing: Tube with diameter "+diameter);
    }
    public Tube(Integer diameter){
        this.diameter = diameter;
    }
}
