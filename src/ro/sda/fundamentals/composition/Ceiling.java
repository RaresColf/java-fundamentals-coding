package ro.sda.fundamentals.composition;
/*
   Create a single room of a house using composition.
   Think about the things that should be included in the room.
   Maybe physical parts of the house but furniture as well
   Add at least one method to access an object via a getter
   Add at least one method to hide the object e.g. not using a getter
    */
public class Ceiling {

    protected String painterColour;

    public Ceiling(String painterColour) {
        this.painterColour = painterColour;
    }

    public void setPainterColour(String painterColour) {
        this.painterColour = painterColour;
    }

    public String getPainterColour() {
        return painterColour;
    }
}

