package com.bbso_01_19_kuznetsov.task4;

import java.util.HashSet;

public class Cat extends CatLike {
    public String name;
    public Cat mother;
    public Cat father;
    public Cat child;
    public char sex;
    public static HashSet<Cat> cats = new HashSet<>();

    public Cat(String name, Cat mother, Cat father, Cat child, char sex) {
        this.name = name;
        this.mother = mother;
        this.father = father;
        this.child = child;
        this.sex = sex;
    }

    public static Cat CreateCats() {
        Cat cat1 = new Cat("Cat1",null,null,null,'m');
        Cat cat2 = new Cat("Cat2",null,null,null,'m');
        Cat cat3 = new Cat("Cat3",null,null,null,'m');
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        return cat1;
    }
    public static void PrintAllCats(){
        for(Cat c:cats){
            System.out.println(c);
        }
    }
    @Override
    public String toString() {
        String t= "I am "+name;
        if(mother!=null)t+=(" my mother is "+mother.name);
        if(father!=null)t+=(" my father is "+father.name);
        if(child!=null){
            if(child.sex=='f')t+=(" my daughter is "+child.name);
            if(child.sex=='m')t+=(" my son is "+child.name);
        }
        return t;
    }
}
