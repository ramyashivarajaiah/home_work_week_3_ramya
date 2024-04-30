package home_work_week_3_ramya;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */
public class project12 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a character: ");
            char input = scanner.next().charAt(0);

            if (Character.isLetter(input)) {
                System.out.println("The input is an alphabet.");
            } else if (Character.isDigit(input)) {
                System.out.println("The input is a number.");
            } else {
                System.out.println("The input is a symbol.");
            }

            scanner.close();
        }

    }
