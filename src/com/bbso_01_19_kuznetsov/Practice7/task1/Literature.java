package com.bbso_01_19_kuznetsov.Practice7.task1;

public class Literature {
    private Printable printable;

    public Literature(Printable printable){
        this.printable = printable;
    }
    public void WhatIsThis(){
        System.out.print("This is a ");printable.Print();
    }
}
