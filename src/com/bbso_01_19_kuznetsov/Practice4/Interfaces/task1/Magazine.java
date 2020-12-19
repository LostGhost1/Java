package com.bbso_01_19_kuznetsov.Practice4.Interfaces.task1;

public class Magazine implements Printable{
    public static void printMagazines(Printable[] literature) {
        for (Printable p : literature) {
            if (p.getClass() == Magazine.class) {
                p.Print();
            }
        }
    }
    public String Title;
    public Magazine(String Title){
        this.Title=Title;
    }

    @Override
    public void Print() {
        System.out.println("This magazine's title is "+Title);
    }
}
