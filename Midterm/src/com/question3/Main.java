package com.question3;

public class Main {

    public static void main(String[] args){

        Mood mood = new Happy("vaishali");
        Mood mood1 = new Sad("harry");

        Psychiatrist psychiatrist = new Psychiatrist();
        psychiatrist.examine(mood);
        psychiatrist.observe(mood);

        System.out.println(/***********************************************/);

        psychiatrist.examine(mood1);
        psychiatrist.observe(mood1);

    }

}
