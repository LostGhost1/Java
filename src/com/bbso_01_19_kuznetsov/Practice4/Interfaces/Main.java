package com.bbso_01_19_kuznetsov.Practice4.Interfaces;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("-------------------Task1-----------------");
        com.bbso_01_19_kuznetsov.Practice4.Interfaces.task1.Main.main(null);
        System.out.println("-------------------Task2-----------------");
        com.bbso_01_19_kuznetsov.Practice4.Interfaces.task2.Main.main(null);
        System.out.println("-------------------Task3-----------------");
        File f= new File("src/com/bbso_01_19_kuznetsov/Practice4/Interfaces/task3/Main");
        try {
            Scanner s = new Scanner(f);
            System.out.println(s.nextLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
