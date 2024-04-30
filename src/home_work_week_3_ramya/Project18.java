package home_work_week_3_ramya;

/**
 * Write a Java program to sum values of an array.
 */
public class Project18 {

    public static void main(String[] args) {
        // Array of values
        int[] values = {5, 7, 2, 9, 4};

        // Calculate the sum
        int sum = 0;
        for (int value : values) {
            sum += value;
        }

        // Display the sum
        System.out.println("Sum of the array values: " + sum);
    }
}
