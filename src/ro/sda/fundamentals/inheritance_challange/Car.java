package ro.sda.fundamentals.inheritance_challange;
/*
       Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
       Finally, create another class, a specific type of Car that inherits from the Car class.
       You should be able to hand steering, changing gears, and moving (speed in other words).
       You will want to decide where to put the appropriate state and behaviours (fields and methods).
       As mentioned above, changing gears, increasing/decreasing speed should be included.
       For you specific type of vehicle you will want to add something specific for that type of car.
       */
public class Car extends Vehicle {
    protected int roti;
    protected int curentGear;
    protected boolean isManual;


    public Car(String newColor, String newName, int newSpeed, String newDirection, int roti, int curentGear, boolean isManual) {
        super(newColor, newName, newSpeed, newDirection);
        this.roti = roti;
        this.curentGear = curentGear;
        this.isManual = isManual;
    }

    public void changeGear(int newGear) {
        System.out.println("Changed gear from " + this.curentGear + " to " + newGear + " gear");
        this.curentGear = newGear;
    }

}