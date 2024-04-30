package home_work_week_3_ramya;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class project8 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in); // creating scanner to get input from customer
        System.out.println("Enter the alphabet from 'A' to 'F': ");
        char alphabets = object.next().charAt(0);

        project8 cityWise = new project8();
        cityWise.getCityName(alphabets);
    }

    public void getCityName(char charValue) {

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