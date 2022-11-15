package ro.sda.fundamentals.composition;
/*
   Create a single room of a house using composition.
   Think about the things that should be included in the room.
   Maybe physical parts of the house but furniture as well
   Add at least one method to access an object via a getter
   Add at least one method to hide the object e.g. not using a getter
    */
public class Bed {
    protected int height;
    protected int pillows;
    protected String style;
    protected boolean isCleaned;

    public Bed(int height, int pillows, String style, boolean isCleaned) {
        this.height = height;
        this.pillows = pillows;
        this.style = style;
        this.isCleaned = isCleaned;
    }

    public void cleanBed() {
        isCleaned = true;
        System.out.println(" The bed is clean ");
    }

    public int getHeight() {
        return height;
    }

    public int getPillows() {
        return pillows;
    }

    public String getStyle() {
        return style;
    }

    public boolean isCleaned() {
        return isCleaned;
    }

}
