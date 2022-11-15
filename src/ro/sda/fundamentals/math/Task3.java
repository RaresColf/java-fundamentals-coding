package ro.sda.fundamentals.math;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;

        System.out.println(" Enter number a: ");
        a = scanner.nextInt();

        System.out.println(" Enter number b: ");
        b = scanner.nextInt();

        System.out.println(" Enter number c: ");
        c = scanner.nextInt();

        QuadraticEq eq = new QuadraticEq();
        int d = eq.calculateDelta(a, b, c);

        eq.calculateRoots(d, a, b);


    }
}
