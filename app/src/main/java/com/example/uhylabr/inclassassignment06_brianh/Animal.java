package com.example.uhylabr.inclassassignment06_brianh;

import java.io.Serializable;



public class Animal implements Serializable {

    private String name;
    private String legs;
    private String information;
    private boolean hasFur=true;
    private String furryCreature;

    public void Animals(String name, String legs, String information) {
        this.name = name;
        this.legs = legs;
        this.information = information;
        }


    public void setAnimals(String name, String legs, String information) {
        this.name = name;
        this.legs = legs;
        this.information = information;

    }

    //has a toString() that returns something like: "Animal Type/Name: " + animalName + "\nNumber of Legs:


        public String toString() {
            return "Animal{" +
                    "name='" + name + '\'' +
                    ", legs='" + legs + '\'' +
                    ", information='" + information + '\'' +
                    ", hasFur=" + hasFur +
                    ", furryCreature='" + furryCreature + '\'' +
                    '}';



    }
}