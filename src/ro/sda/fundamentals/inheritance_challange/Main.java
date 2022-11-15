package ro.sda.fundamentals.inheritance_challange;

import org.w3c.dom.ls.LSOutput;

/*
       Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
       Finally, create another class, a specific type of Car that inherits from the Car class.
       You should be able to hand steering, changing gears, and moving (speed in other words).
       You will want to decide where to put the appropriate state and behaviours (fields and methods).
       As mentioned above, changing gears, increasing/decreasing speed should be included.
       For you specific type of vehicle you will want to add something specific for that type of car.
       */
public class Main {
    public static void main(String[] args) {

        Vehicle vehicol = new Vehicle("red", "Nemo", 70, "North");

        vehicol.increaseSpeed(-10);
        vehicol.increaseSpeed(50);
        vehicol.decreaseSpeed(200);
        vehicol.decreaseSpeed(20);
        vehicol.steer("Sud");

        System.out.println("---------------------------------------------------");

        Car masina = new Car("black", "nume", 150, "East", 2, 3, true);

        masina.changeGear(6);
        masina.increaseSpeed(10);
        masina.decreaseSpeed(50);
        masina.steer("West");

        System.out.println("---------------------------------------------------");

        SuperCar lambo = new SuperCar("yellow", "Gallardo", 500, "North", 4, 6, true);

        lambo.turnOffNos();
        lambo.turnOnNos();
        lambo.changeGear(5);
        lambo.decreaseSpeed(150);

    }
}

