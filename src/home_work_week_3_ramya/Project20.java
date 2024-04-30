package home_work_week_3_ramya;

/**
 * Write a Java program to test if an array contains a specific value.
 */
public class Project20 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int targetValue = 3;

        if (containsValue(array, targetValue)) {
            System.out.println("The array contains the value " + targetValue);
        } else {
            System.out.println("The array does not contain the value " + targetValue);
        }
    }

    public static boolean containsValue(int[] array, int targetValue) {
        for (int element : array) {
            if (element == targetValue) {
                return true;
            }
        }
        return false;
    }
}
