package ro.sda.fundamentals.math;

import java.text.DecimalFormat;

public class QuadraticEq {
    public int calculateDelta (int a, int b, int c) {
        int delta;
        delta =  (int)Math.pow(b, 2) - (4 * a * c);
        if(delta < 0 ) {
            System.err.println(" delta is negative ");
            System.exit(0);
        }
        return delta;

    }

    public void calculateRoots(int delta, int a, int b) {
        // x1 = (-b-Math.squrt(delta)) / (2*a)
        // x2 = (-b+Math.squrt(delta)) / (2*a)

        double x1, x2;
        DecimalFormat df = new DecimalFormat("#.##");

        x1 = (-b-Math.sqrt(delta)) / (2*a);
        x2 = (-b+Math.sqrt(delta)) / (2*a);

        System.out.println(" First root is: " + df.format(x1));
        System.out.println(" Second root is: " + df.format (x2));
    }

}
