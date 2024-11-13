package LabProblems.Basics;

// Write a JAVA Program to add numbers until the user enters 0 using a Do-While loop.

import java.util.Scanner;

class AddUntilZero {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int num,sum=0;
        System.out.println("Enter the Numbers. Enter 0 to terminate Entry: ");
        do{
            num = src.nextInt();
            sum+=num;
        }while(num!=0);
        System.out.println("Sum of numbers entered is: " + sum);
        src.close();
    }
}
