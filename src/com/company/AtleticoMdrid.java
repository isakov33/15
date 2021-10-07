package com.company;

public class AtleticoMdrid extends FootballTeam implements Printable {
String bestPlayer;
String name;

    public AtleticoMdrid(int worldCup, String bestPlayer, String name) {
        super(worldCup);
        this.bestPlayer = bestPlayer;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getBestPlayer() {
        return bestPlayer;
    }

    @Override
    public void print() {
        System.out.println("best player" + getBestPlayer()  +" "+ "\nname" + getName() + " " + "woc" + getWorldCup());
    }
}
