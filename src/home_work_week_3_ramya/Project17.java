package home_work_week_3_ramya;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */
public class Project17 {

    public static void main(String[] args) {
        // Numeric array
        int[] numericArray = {7, 2, 0, 1, 5};
        System.out.println("Original numeric array: " + Arrays.toString(numericArray));
        Arrays.sort(numericArray);
        System.out.println("Sorted numeric array: " + Arrays.toString(numericArray));

        // String array
        String[] stringArray = {"Straberry", "blueberry", "rasberry", "plum", "melon"};
        System.out.println("\nOriginal string array: " + Arrays.toString(stringArray));
        Arrays.sort(stringArray);
        System.out.println("Sorted string array: " + Arrays.toString(stringArray));

    }


}
