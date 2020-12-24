package com.bbso_01_19_kuznetsov.Practice8;

public class Main {
    public static void main(String[] args){
        System.out.println("-------------------Task1-----------------");
        com.bbso_01_19_kuznetsov.Practice8.task1.Main.main(null);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("-------------------Task2-----------------");
        com.bbso_01_19_kuznetsov.Practice8.task2.Main.main(null);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("-------------------Task3-----------------");
        com.bbso_01_19_kuznetsov.Practice8.task3.Main.main(null);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
