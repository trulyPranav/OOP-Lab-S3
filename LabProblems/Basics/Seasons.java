package LabProblems.Basics;

// Write a JAVA Program to display season corresponding to differnent months in a year:
// using an If-Else Ladder.
// 1,2,12 => Winter
// 3,4,5 => Spring
// 6,7,8 => Summer
// 9,10,11 => Autumn
// Else Bogus Month.

import java.util.Scanner;

class Seasons {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter Season Number: ");
        int season = src.nextInt();
        if(season == 1 || season == 2 || season == 12)
            System.out.println("Winter");
        else if(season == 3 || season == 4 || season == 4)
            System.out.println("Spring");
        else if(season == 6 || season == 7 || season == 8)
            System.out.println("Summer");
        else if(season == 9 || season == 10 || season == 11)
            System.out.println("Autumn");
        else System.out.println("Bogus Month");
        src.close();
    }
}
