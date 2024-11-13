package LabProblems.Basics;

// Write a JAVA Program to print Fibonacci Series.

import java.util.Scanner;

class FibonacciCalculation{
    int fibonacci(int n){
        if(n == 0 || n == 1)
            return n;
        else return fibonacci(n-1) + fibonacci(n-2);
    }
}

class Fibonacci {
    public static void main(String[] args) {
        FibonacciCalculation fc = new FibonacciCalculation();
        Scanner src = new Scanner(System.in);
        System.out.print("Enter the number of terms required: ");
        int n = src.nextInt();
        System.out.print("Series is: ");
        for(int i=0; i<n; i++){
            System.out.print(fc.fibonacci(i) + " ");
        }
        src.close();
    }    
}
