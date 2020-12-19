package com.bbso_01_19_kuznetsov.Practice4.Collections.task3;

public class HeavyBox implements Comparable{
    private Integer weight=0;

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Object o) {
        HeavyBox b = (HeavyBox) o;
        return b.getWeight()-weight;
    }
}
