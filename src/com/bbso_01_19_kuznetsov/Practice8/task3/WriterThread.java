package com.bbso_01_19_kuznetsov.Practice8.task3;

import java.util.Random;
import java.util.Vector;

public class WriterThread extends Thread{
    final Vector<Integer> numbers;
    private int id;
    Random random;
    public WriterThread(Vector<Integer> numbers, int id){
        this.numbers=numbers;
        this.id = id;
        random=new Random();
    }

    @Override
    public void run() {
        for(int i=0;i<numbers.capacity();i++){
            synchronized (numbers){
                numbers.set(i,random.nextInt(1000));
                System.out.println("Writer "+id+" has written "+numbers.get(i)+" to position "+i);
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
