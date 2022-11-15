package ro.sda.fundamentals.composition;
/*
   Create a single room of a house using composition.
   Think about the things that should be included in the room.
   Maybe physical parts of the house but furniture as well
   Add at least one method to access an object via a getter
   Add at least one method to hide the object e.g. not using a getter
    */
public class Bedroom {

    protected Wall wall1, wall2, wall3,wall4 ;   // aceasta operatiune se numeste composition, pentru ca in loc sa avem variabile ne folosim de tipurile create de noi
    protected Lamp lamp;
    protected Bed bed;
    protected Ceiling ceiling;

    public Bedroom(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Lamp lamp, Bed bed, Ceiling ceiling) {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.lamp = lamp;
        this.bed = bed;
        this.ceiling = ceiling;
    }

    public void turnOnTheLight () {
        System.out.println("Light turned on ");
        this.lamp.turnOn();
    }

    public void turnOffTheLight() {
        System.out.println("Light turned off ");
        this.lamp.turnOff();
    }

    public Bed getBed() {
        return bed;
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }


}
