package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean isMale = true; // true or false
        char letterGrade = 'A'; // character
        int numOfDaysUntillSchoolStarts = 90; // integer
        String address = "1346 River Road"; // word or phrase
        double averageGpa = 4.00; // number with decimals
        String currentPresident = "Trump";
        double income = 1000.00;

        System.out.println(numOfDaysUntillSchoolStarts + averageGpa);

        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println(name + " " + "Bin");
        System.out.println();
    }
}
