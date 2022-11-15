package ro.sda.fundamentals.math;

import java.util.Scanner;

// BMI = weight(kg) / Height^2 (m)
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight;
        System.out.println(" Insert weight in kg ");
        weight = scanner.nextDouble();
        int height;
        System.out.println(" Insert height in cm ");
        height = scanner.nextInt();

        calculateBmi(height, weight);

    }

    /**
     * @param height h is height
     * @param weight w is weight
     */
    public static void calculateBmi(int height, double weight) {
        double heightInCm = height / 100.0;
        double bmi = weight / Math.pow(heightInCm, 2);

        if (bmi < 18.5 || bmi > 24.9) {
            System.out.println(" BMI not optimal ");
        } else {
            System.out.println(" BMI optimal ");
        }
    }


}
