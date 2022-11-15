package ro.sda.fundamentals.inheritance_challange;

/*
       Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
       Finally, create another class, a specific type of Car that inherits from the Car class.
       You should be able to hand steering, changing gears, and moving (speed in other words).
       You will want to decide where to put the appropriate state and behaviours (fields and methods).
       As mentioned above, changing gears, increasing/decreasing speed should be included.
       For you specific type of vehicle you will want to add something specific for that type of car.
       */
public class Vehicle {

    protected String color;
    protected String name;
    protected int speed;
    protected String direction;

    public Vehicle() {

    }

    public Vehicle(String newColor, String newName, int newSpeed, String newDirection) {
        this.color = newColor;
        this.name = newName;
        this.direction = newDirection;
        this.speed = newSpeed;

    }

    public void increaseSpeed(int addition) {
        if (addition > 0) {
            System.out.println("Speed increased with " + addition + " km/h");
            this.speed += addition;
        } else {
            System.out.println("Negative speed is not allowed!");
        }
    }

    public void decreaseSpeed(int decrement) {
        if (decrement >= 0 && (this.speed - decrement >= 0)) {
            System.out.println("Speed decreased with " + decrement + " km/h");
            this.speed -= decrement;
        } else {
            System.out.println("Operation not allowed!");
        }

    }

    public void steer(String newDirection) {
        System.out.println("Direction changed from " + this.direction + " to " + newDirection);
        this.direction = newDirection;
    }
}


