package com.company;

public class FcRealmadrid extends FootballTeam implements Printable{
    String colourForm;
    String name;

    public FcRealmadrid(int worldCup, String colourForm, String name) {
        super(worldCup);
        this.colourForm = colourForm;
        this.name = name;
    }

    public String getColourForm() {
        return colourForm;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("name-" + getName() + "" +
                "\ncolour" +" " + getColourForm()+ " " + "worldcup" + getWorldCup());

    }
}
