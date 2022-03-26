package com.question3;

public class Happy extends Mood{

    String name;

    public Happy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getMood() {
        String happy = "Happy";
        return happy;
    }

    @Override
    void expressFeelings() {
        System.out.println("Hahahhah");
    }

    public String toString() {
        String message = this.name + " laughs a lot";
        return message;
    }
}
