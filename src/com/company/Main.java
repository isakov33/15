package com.company;

public class Main {

    public static void main(String[] args){
        creatObject("Real_Madrid");
        System.out.println("------------");
        creatObject("Barcelona");
        System.out.println("---------------");
        creatObject("atleticomadrid");

    }
    public static FootballTeam creatObject(String className){
        switch (className){
            case "Real_Madrid":
                FcRealmadrid real_madrid = new FcRealmadrid(0,"white","RMA");
                real_madrid.print();
                return real_madrid;

            case "Barcelona":
                Fcbarcelona barcelona = new Fcbarcelona(15,2000000,"FCB");
                barcelona.print();
                return barcelona;

            case "Psg":
                AtleticoMdrid atleticoMdrid= new AtleticoMdrid(8,"Griezman","ATM");
                atleticoMdrid.print();
                return atleticoMdrid;
        }
        return null;
}
}