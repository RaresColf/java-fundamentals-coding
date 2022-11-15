package ro.sda.fundamentals.math;

import java.util.Scanner;

public class Task1 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter diameter ");

        float diameter = scanner.nextFloat();
        float raza = diameter / 2;
        float perimeter = 2 * raza * (float) Math.PI;
        double aria = Math.PI * Math.pow(raza, 2);
        System.out.format(" diametrul este: %.2f " , perimeter);
        System.out.format(" aria este: %.2f " , aria);


    }
}
