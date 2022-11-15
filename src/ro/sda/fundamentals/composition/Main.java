package ro.sda.fundamentals.composition;

/*
   Create a single room of a house using composition.
   Think about the things that should be included in the room.
   Maybe physical parts of the house but furniture as well
   Add at least one method to access an object via a getter
   Add at least one method to hide the object e.g. not using a getter
    */
public class Main {
    public static void main(String[] args) {

        Wall wall1 = new Wall("North ");
        Wall wall2 = new Wall("South ");
        Wall wall3 = new Wall("East ");
        Wall wall4 = new Wall("West ");
        Ceiling ceiling = new Ceiling("White ");
        Bed bed = new Bed(100, 4, "modern", false);
        Lamp lamp = new Lamp("Yellow", true);
        Bedroom bedroom = new Bedroom(wall1, wall2, wall3, wall4, lamp, bed, ceiling);
        bedroom.turnOnTheLight();

        Bedroom bedroom2 = new Bedroom(new Wall("North"), new Wall("South"), new Wall("East"), new Wall("West"),
                new Lamp("red", true), new Bed(1, 2, "greek", true), new Ceiling("White"));


        bedroom2.getBed().cleanBed();

        System.out.println("Bedroom2 ceiling colour is : " + bedroom2.getCeiling().getPainterColour());
        System.out.println("Bedroom celing colour is: " + bedroom.getCeiling().getPainterColour());

    }
}
