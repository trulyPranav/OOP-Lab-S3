package LabProblems.Basics;

// Write a JAVA Program to add two numbers.

import java.util.Scanner;

class Addition {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int n1 = src.nextInt();
        System.out.println("Enter Second Number: ");
        int n2 = src.nextInt();
        System.out.println("Sum of the numbers is: " + (n1+n2));
        src.close();
    }
}
