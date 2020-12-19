package com.bbso_01_19_kuznetsov.Practice4.Interfaces.task2;


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        Instrument[] instruments = new Instrument[10];
        for(int i=0;i<10;i++){
            switch (i % 3) {
                case 0 -> instruments[i] = new Drums(r.nextInt(10));
                case 1 -> instruments[i] = new Guitar(r.nextInt(10));
                case 2 -> instruments[i] = new Tube(r.nextInt(10));
            }
        }
        for (Instrument i: instruments){
            i.play();
        }
    }
}
