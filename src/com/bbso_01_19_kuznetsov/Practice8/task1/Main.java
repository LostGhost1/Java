package com.bbso_01_19_kuznetsov.Practice8.task1;

public class Main {
    public static void main(String[] args){
        Runnable counter1 = () -> {try{for(int i=0; i<100; i+=10, System.out.println(i),Thread.sleep(100));}catch (InterruptedException ex){} };
        counter1.run();
        counter1.run();
        counter1.run();
    }
}
