package com.bbso_01_19_kuznetsov.Practice4.Collections.task5;

import java.util.Objects;

public class HeavyBox implements Comparable{
    private Integer weight=0;

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HeavyBox)) return false;
        HeavyBox box = (HeavyBox) o;
        return getWeight().equals(box.getWeight());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWeight());
    }

    @Override
    public int compareTo(Object o) {
        HeavyBox b = (HeavyBox) o;
        return b.getWeight()-weight;
    }
}
