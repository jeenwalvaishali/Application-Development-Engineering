package com.question3;

public class Psychiatrist {

    public void examine(Mood moodyObject) {
        System.out.println("How are you feeling today");
        System.out.println(moodyObject.getMood());
    }

    public void observe(Mood moodyObject) {
        System.out.println("");
        System.out.println(moodyObject);
    }

}
