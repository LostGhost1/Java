package com.bbso_01_19_kuznetsov.Practice8.task3;

import java.util.Random;
import java.util.Vector;

public class Main {
    public static void main(String[] args){
        Random r = new Random();
        Vector<Integer> numbers= new Vector<>(r.nextInt(90)+10);
        for(int i=0;i<numbers.capacity();i++)
            numbers.add(0);
        System.out.println("Created vector of size "+numbers.capacity());
        int rtc=0,wtc=0;
        int threadcount= r.nextInt(4)+3;
        System.out.println("Creating "+threadcount+" threads...");
        for(int i=0;i<threadcount;i++){
            if(r.nextBoolean()){
                new ReaderThread(numbers, ++rtc).start();
            }else{
                new WriterThread(numbers, ++wtc).start();
            }
        }
    }
}
