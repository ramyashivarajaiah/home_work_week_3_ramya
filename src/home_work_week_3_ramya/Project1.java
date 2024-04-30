package home_work_week_3_ramya;

import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
public class Project1 {
    public static void main(String[] args) {

        //Scanner decleration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num to test");
        int num = scanner.nextInt();
        scanner.close();

        //tenery operator to check number
        String result = num % 2 == 0 ? "Even" : "odd";
        System.out.println(num + " is " + result);

    }
}
