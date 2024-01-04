package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberofPaws;
    private boolean hasFur;

    public Animal(String color, int numberofPaws, boolean hasFur) {
        this.color = color;
        this.numberofPaws = numberofPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String far = this.hasFur ? "a" : "no";

        return "This animal is mostly " + this.color +
            ". It has " + this.numberofPaws +
            " paw" + (numberofPaws > 1 ? "s" : "") +
            " and " + far + " fur.";
    }
}
