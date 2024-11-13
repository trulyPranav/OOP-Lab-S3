package LabProblems.Basics;

// Write a JAVA Program to check if a number is Odd or Even using If-Else.

import java.util.Scanner;

class OddEven {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = src.nextInt();
        if(num%2 == 0)
            System.out.println("Number is Even");
        else System.out.println("Number is Odd");
        src.close();
    }
}
