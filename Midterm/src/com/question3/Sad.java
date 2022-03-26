package com.question3;

public class Sad extends Mood{

    String name;

    public Sad(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getMood() {
        String happy = "Sad";
        return happy;
    }

    @Override
    void expressFeelings() {
        System.out.println("weep");
    }


    public String toString() {
        String message = this.name + " cries a lot";
        return message;
    }
}
