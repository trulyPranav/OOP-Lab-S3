package LabProblems.Basics;

// Write a JAVA Program to print Factorial of a number.

import java.util.Scanner;

class FactCalc {
    int factCalc(int n){
        if(n == 0 || n == 1)
            return n;
        else return n * factCalc(n-1);
    }
}

class Factorial {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        FactCalc fc = new FactCalc();
        System.out.print("Enter the number: ");
        int num = src.nextInt();
        System.out.println("Factorial of the Number " + num + " is: " + fc.factCalc(num));
    }
}
