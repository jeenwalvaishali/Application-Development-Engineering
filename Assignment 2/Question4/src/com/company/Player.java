package com.company;

public class Player {
    private String name;
    private int score;

    public Player(String name, int score){
        this.name = name;
        this.score = score;
    }

    public String getName()
    {
        return name;
    }

    public void setName(){
        this.name = name;
    }

    public int getScore()
    {
        return score;
    }

    public void setScore(){
        this.score = score;
    }
}
