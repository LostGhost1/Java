package com.bbso_01_19_kuznetsov.Practice4.Collections.task6;

enum Season {

    SUMMER(25) {
        @Override
        void getDescription() {
            System.out.println("Hot season of the year");
        }

        @Override
        public String toString() {
            return "Summer comes after Spring and before Autumn, has mean temperature of " + SUMMER.meantemperature;
        }
    },
    AUTUMN(8) {
        @Override
        void getDescription() {
            System.out.println("Chill season of the year");
        }

        @Override
        public String toString() {
            return "Autumn comes after Summer and before Winter, has mean temperature of " + AUTUMN.meantemperature;
        }
    },
    WINTER(-10) {
        @Override
        void getDescription() {
            System.out.println("Cold season of the year");
        }

        @Override
        public String toString() {
            return "Winter comes after Autumn and before Spring, has mean temperature of " + WINTER.meantemperature;
        }
    },
    SPRING(10) {
        @Override
        void getDescription() {
            System.out.println("Warm season of the year");
        }

        @Override
        public String toString() {
            return "Spring comes after Winter and before Summer, has mean temperature of " + SPRING.meantemperature;
        }
    };
    private final Integer meantemperature;

    Season(Integer meantemperature) {
        this.meantemperature = meantemperature;
    }

    abstract void getDescription();
}
