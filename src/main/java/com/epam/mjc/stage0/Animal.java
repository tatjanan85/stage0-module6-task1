package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberofPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberofPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String far = this.hasFur ? "a" : "no";

        return "This animal is mostly " + this.color +
            ". It has " + this.numberOfPaws +
            " paw" + (numberOfPaws > 1 ? "s" : "") +
            " and " + far + " fur.";
    }
}
