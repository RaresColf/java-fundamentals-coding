package ro.sda.fundamentals.readIntegers;

import java.lang.reflect.Array;
import java.util.Scanner;

/*
    Write a method called readIntegers() with a parameter called count that represents
    how many integers the user need to enter.

    The method need to read from the console until all the numbers are entered, and
    then return an array containing the numbers entered.

    Write a method findMin() with the array as a parameter. The method need to return
    the minimum value in the array.

    In the main() method read the count from the console and call the method readIntegers()
    with the count parameter.

    Then call the findMin() method passing the array returned from the call to the
    readIntegers() method.
    */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter count: ");
        int count;
        count = scanner.nextInt();
        int array[] = readIntegers(count);
        int returnMin = findMin(array);
        System.out.println(" Min = " + returnMin);
    }

    public static int[] readIntegers(int count) {
        int[] array = new int[count];       // asa am initializat o variabila de tip array
        Scanner object = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println(" Enter number: \t ");
            array[i] = object.nextInt();
        }
        return array;

    }

    public static int findMin(int[] array) {
        int minim = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minim) {
                minim = array[i];
            }
        }
        return minim;
    }
}
