package ro.sda.fundamentals.inheritance_challange;

public class SuperCar extends Car {

    private int horsePower;
    private static int nosAddition = 50;

    public SuperCar(String newColor, String newName, int newSpeed, String newDirection, int roti, int curentGear, boolean isManual) {
        super(newColor, newName, newSpeed, newDirection, roti, curentGear, isManual);
        this.horsePower = horsePower;
    }

    public void turnOnNos() {
        System.out.println("HP increase by " + nosAddition);
        this.horsePower += nosAddition;
    }

    public void turnOffNos() {
        System.out.println("HP decreased by " + nosAddition);
        this.horsePower -= nosAddition;
    }
}
