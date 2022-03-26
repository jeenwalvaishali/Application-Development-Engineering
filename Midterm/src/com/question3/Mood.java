package com.question3;

public abstract class Mood {

    abstract String getMood();
    abstract void expressFeelings();

    public Mood() {
    }

    public void queryMood(){
        System.out.println("I feel" + getMood());
    }

}
