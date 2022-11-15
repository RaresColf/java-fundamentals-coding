package ro.sda.fundamentals.composition;
/*
   Create a single room of a house using composition.
   Think about the things that should be included in the room.
   Maybe physical parts of the house but furniture as well
   Add at least one method to access an object via a getter
   Add at least one method to hide the object e.g. not using a getter
    */
public class Lamp {

    protected String color;
    protected boolean isTurnedOn;

    public Lamp(String color, boolean isTurnedOn) {
        this.color = color;
        this.isTurnedOn = isTurnedOn;
    }

    public void turnOn() {
        System.out.println(" Lamp turned on ");
        this.isTurnedOn = true;

    }

    public void turnOff(){
        System.out.println(" Lamp turned  off ");
        isTurnedOn = false; // this. e optional aici
    }

}
