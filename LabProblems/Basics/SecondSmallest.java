package LabProblems.Basics;

// Write a JAVA program to find the second smallest element in an array.

import java.util.Scanner;

class SecondSmallest {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter the Size of the Array: ");
        int n = src.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Array: ");
        for(int i=0; i<n; i++)
            arr[i] = src.nextInt();
        // Bubble Sorting:
        int temp = 0;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("Second Smallest Element in the Array is: " + arr[1]);
        src.close();
    }
}
