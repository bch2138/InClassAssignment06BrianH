package com.example.uhylabr.inclassassignment06_brianh;

import java.io.Serializable;

/**
 * Created by UHYLABR on 3/1/2018.
 */

public class Animal implements Serializable {
    String name;
    String legs;
    String information;
    boolean hasFur=true;
    String furryCreature;

    //has a toString() that returns something like: "Animal Type/Name: " + animalName + "\nNumber of Legs:

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

    public String getAnimals() {
        return "Animal Name: "+name+"\nNumber of Legs: "+legs+"\nHas Fur: "+hasFur+"\nMore Information: "+information;

    }
}