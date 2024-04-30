package home_work_week_3_ramya;

import java.util.Scanner;

/**
 * Same as above program-8 using switch statement.
 */
public class project9 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in); // creating scanner to get input from customer
        System.out.println("Enter the alphabet from 'A' to 'F': ");
        char alphabets = object.next().charAt(0);

        project8 cityWise = new project8();
        cityWise.getCityName(alphabets);
    }

    public void getCityName(char charValue) {

        switch (charValue) {
            case 'A':
                System.out.println("City is Amsterdam ");
                break;
            case 'B':
                System.out.println("City is Brighton");
                break;
            case 'C':
                System.out.println("City is Cardif");
                break;
            case 'D':
                System.out.println("City is Dan Hill");
                break;
            case 'E':
                System.out.println("City is Elam Hurst");
                break;
            case 'F':
                System.out.println("City is France");
                break;
            default:
                System.out.println("Any other City name does not exisit");
        }

        if (charValue == 'A' || charValue == 'a') {//For character single quote Ex. 'A'
            System.out.println("City is Amsterdam ");
        } else if (charValue == 'B' || charValue == 'b') {
            System.out.println("City is Brighton");
        } else if (charValue == 'C' || charValue == 'c') {
            System.out.println("City is Cardif");
        } else if (charValue == 'D' || charValue == 'd') {
            System.out.println("City is Dan Hill");
        } else if (charValue == 'E' || charValue == 'e') {
            System.out.println("City is Elam Hurst");
        } else if (charValue == 'F' || charValue == 'f') {
            System.out.println("City is France");
        } else {
            System.out.println("Any other City name does not exisit");
        }
    }
}

