package com.company;

//Question 4: Comparators are used to compare two objects. You'll create a
//comparator and use it to sort an array. You must create Player class. It has 2 fields:
//a String name and a score integer. Given an array of Player objects, write a
//comparator that sorts them in order of decreasing score; if 2 or more players have
//the same score, sort those players alphabetically by name.
//write an int compare (Player a, Player b) method implementing the Comparator.
//compare (T o1, T o2) method.

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Player sachin = new Player("Sachin Tendulkar", 100);
        Player mahendra = new Player("Mahendra Singh Dhoni", 100);
        Player ab_devillers = new Player("AB Devillers", 100);
        Player bret_lee = new Player("Bret Lee", 100);
        Player chris_gayle = new Player("Chris Gayle", 100);
        Player bradon_mecculam = new Player("Bradon Mecculam", 99);
        Player chris_morris = new Player("Chris Morris", 97);
        Player rohit = new Player("Rohit Sharma", 99);
        Player virat = new Player("Virat Kohli", 97);
        Player raina = new Player("Suresh Raina", 95);

        Player[] players = {sachin, mahendra,ab_devillers,bradon_mecculam,chris_gayle,rohit,virat, raina, chris_morris, bret_lee};

        Arrays.sort(players, comparatorScore(false));
        System.out.println("************") ;
        printPlayer(players);

    }


    private static void printPlayer(Player[] player)
    {
        System.out.println("Name, \tScore");
        for(Player players: player){
            System.out.println(players.getName() + "\t" + players.getScore());
        }
    }


    private static Comparator<Player> comparatorScore(boolean scoreDescending){
        if(scoreDescending){
            return new Comparator<Player>(){
                @Override
                public int compare(Player p1, Player p2){
                    return Integer.compare(p1.getScore(), p2.getScore());
                }
            };
        }
        return new Comparator<Player>(){
            @Override
            public int compare(Player p1, Player p2){
                if(p1.getScore() == p2.getScore()){
                    return p1.getName().compareTo(p2.getName());
                }
                return Integer.compare(p2.getScore(), p1.getScore());
            }
        };
    }
}
