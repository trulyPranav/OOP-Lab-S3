package LabProblems.Basics;

// Write a JAVA program to display sum of array elements using ‘for-each’ version of for loop.

import java.util.Scanner;

class ArraySum {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter the Size of the Array: ");
        int n = src.nextInt();
        System.out.print("Enter the Array Elements: ");
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = src.nextInt();
        int sum = 0;
        for(int num: arr)
            sum += num;
        System.out.println("Sum of the Array Elements is: " + sum);
        src.close();
    }
}
