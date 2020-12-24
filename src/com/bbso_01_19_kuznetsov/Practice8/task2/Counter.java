package com.bbso_01_19_kuznetsov.Practice8.task2;

public class Counter extends Thread{
    final StringBuilder s;
    @Override
    public void run() {
        synchronized (s){
            for(int i=0;i<100;i++)
                System.out.println(s);
            s.setCharAt(0,(char)(s.charAt(0)+1));
        }
    }
    public Counter(StringBuilder s){
        this.s=s;
    }
}
