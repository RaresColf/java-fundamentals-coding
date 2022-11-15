package ro.sda.fundamentals.math;

public class Task4 {
    public static void main(String[] args) {
        printFactors(32);
        printFactors(10);

    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println(" Invalid value ");
        } else {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
