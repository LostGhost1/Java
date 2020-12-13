package com.bbso_01_19_kuznetsov.task2;

public class Main {

    public static void main(String[] args) {
        Cat daughter= new Cat("Daughter",null,null,null,'f');
        Cat son= new Cat("Son",null,null,null,'m');
        Cat mother= new Cat("Mother",null,null,daughter,'f');
        Cat father= new Cat("Father",null,null,son,'m');
        daughter.mother=mother;
        daughter.father=father;
        son.mother=mother;
        son.father=father;
        Cat grandmother = new Cat("Grandmother",null,null,mother,'f');
        Cat grandfather = new Cat("Grandfather",null,null,father,'m');
        mother.mother=grandmother;
        father.father=grandfather;
        System.out.println(daughter);
        System.out.println(son);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(grandfather);
        System.out.println(grandmother);
    }
}
