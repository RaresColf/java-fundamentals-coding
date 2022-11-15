package ro.sda.fundamentals.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
        Write a method called reverse() with an int array as a parameter.
        The method should not return any value. In other words, the method
        is allowed to modify the array parameter.

        In main() test the reverse() method and print the array both reversed
        and non-reversed.

        To reverse the array, you have to swap the elements, so that the first element is
        swapped with the last element and son on.

        For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.
        */
public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] array2 = new int[]{1,2,3,4,5};

        System.out.println(" Array= " + Arrays.toString(array));

        reverse(array);

    }

    public static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        int haldIndex = array.length / 2;
        for (int i = 0; i < haldIndex; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;


        }

    }

}


