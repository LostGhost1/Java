package com.bbso_01_19_kuznetsov.Practice7.task8;

public class HeavyBox {
    private Long weight;
    public HeavyBox(Long weight){
        this.weight=weight;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                '}';
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }
}
