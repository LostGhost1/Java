package com.bbso_01_19_kuznetsov.task3;

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
        Cat cat1 = new Cat("Cat1",null,null,null,'m');
        Cat cat2 = new Cat("Cat2",null,null,null,'m');
        Cat cat3 = new Cat("Cat3",null,null,null,'m');
        Cat cat4 = new Cat("Cat4",null,null,null,'m');
        Cat.PrintAllCats();
    }
}
