package ro.sda.fundamentals.classes.wall;

public class Main {
    public static void main(String[] args) {
        Wall wall = new Wall(5,4);
        System.out.println(" Area = " + wall.getArea());
        wall.setHeight(-5);
        System.out.println(" Height = " + wall.getHeight());
        System.out.println(" Width = " + wall.getWith());
        System.out.println(" Area = " + wall.getArea());
    }
}
