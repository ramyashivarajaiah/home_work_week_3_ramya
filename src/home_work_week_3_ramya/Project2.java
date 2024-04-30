package home_work_week_3_ramya;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */
public class Project2 {
    public static void main(String[] args) {
        // Scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the year");
        int year = scanner.nextInt();
        scanner.close();

        boolean a = (year % 4) == 0; //'==' verify if both operands are equal
        boolean b = (year % 100) != 0; //'!=' not equal : verify both operands are not equal
        boolean c = ((year % 100 == 0) && (year % 400 == 0));
        ; // '&&' named logical: logical and returns true if both operands are true

        //if statement
        if (a && (b || c)) {
            System.out.println(year + "is a leap year");
        } else {
            System.out.println(year + "is a not leap year");
        }
    }
}


