package LabProblems.Basics;

// Write a JAVA Program to display Floyd's Triangle using For loop.

import java.util.Scanner;

class FloydsTriangle {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the number of Rows required: ");
        int rows = src.nextInt();
        int number = 1;
        for(int i=0; i<rows; i++){
            for(int j=0; j<=i; j++){
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
        src.close();
    }
}
