package home_work_week_3_ramya;

/**
 * Write a Java program to calculate the average value of array elements.
 */
public class Project19 {
    public static void main(String[] args) {
        // Array of values
        double[] values = {7.5, 2.7, 1.8, 6.1, 4.6};

        // Calculate the sum
        double sum = 0;
        for (double value : values) {
            sum += value;
        }

        // Calculate the average
        double average = sum / values.length;

        // Display the average
        System.out.println("Average of the array elements: " + average);
    }

}
