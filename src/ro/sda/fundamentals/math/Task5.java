package ro.sda.fundamentals.math;
//Write a method named getEvenDigitSum with one parameter of type int called number.
//        The method should return the sum of the even digits within the number.
//        If the number is negative, the method should return -1 to indicate an invalid value.
//
//        Example input/output:
//        *   getEvenDigitSum(123456789); -> should return 20 since 2 + 4 + 6 + 8 = 20
//        *   getEvenDigitSum(252); -> should return 4 since 2 + 2 = 4
//        *   getEvenDigitSum(-22); -> should return -1 since the number is negative
//        */


public class Task5 {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456));

    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        } else {
            int sum = 0;
            int count;
            while (number != 0) {
                count = number % 10;
                number = number / 10;
                if (count % 2 == 0) {
                    sum += count;
                }

            }
            return sum;
        }
    }
}