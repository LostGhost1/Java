package com.bbso_01_19_kuznetsov.task2;

public class Cat extends CatLike{
    public String name;
    public Cat mother;
    public Cat father;
    public Cat child;
    public char sex;
    public Cat() {
    }
    public Cat(String name, Cat mother, Cat father, Cat child, char sex){
        this.name = name;
        this.mother = mother;
        this.father = father;
        this.child = child;
        this.sex = sex;
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
