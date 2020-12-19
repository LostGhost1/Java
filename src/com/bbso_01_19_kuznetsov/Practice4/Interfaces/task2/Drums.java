package com.bbso_01_19_kuznetsov.Practice4.Interfaces.task2;

public class Drums implements Instrument{
    Integer size;
    @Override
    public void play() {
        System.out.println("Now playing: Drums of "+size+" size");
    }
    public Drums(Integer size){

        this.size = size;
    }
}
