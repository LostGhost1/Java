package com.bbso_01_19_kuznetsov.Practice8.task3;

import java.util.Vector;

public class ReaderThread extends Thread{
    final Vector<Integer> numbers;
    private int id;

    public ReaderThread(Vector<Integer> numbers, int id){
        this.numbers=numbers;
        this.id = id;
    }
    @Override
    public void run() {
        for(int i=0;i<numbers.capacity();i++){
            synchronized (numbers){
                System.out.println("Reader "+id+" has read "+numbers.get(i)+" from position "+i);
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
