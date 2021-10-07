package com.company;

public class Fcbarcelona extends FootballTeam implements Printable {
    String name;
    int followers;

    public Fcbarcelona(int worldCup, int followers, String name) {
        super(worldCup);
        this.followers = followers;
        this.name = name;
    }

    public int getFollowers() {
        return followers;
    }

    public String getName() {
        return name;
    }


    @Override
    public void print() {
        System.out.println("\nname-" + getName() +  " " + "followers: " + getFollowers() + " " + "Cubkov:" + getWorldCup());
    }
}
