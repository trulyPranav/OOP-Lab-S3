package LabProblems.ErrorHandling;

// Write a Java program that reads a list of integers from the user and throws an exception if any numbers are duplicates.

import java.lang.Exception;
import java.util.Scanner;

class DuplicateException extends Exception {
    DuplicateException(String name){
        super(name);
    }
}

class CustomException {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter the Number of Integers: ");
        int num = src.nextInt();
        int arr[] = new int[num];
        for(int i=0; i<num; i++){
            arr[i] = src.nextInt();
            try {
                for(int j=i-1; j>=0; j--){
                    if(arr[i] == arr[j])
                        throw new DuplicateException("Duplicate Element Entered!");
                }
            } catch (DuplicateException de) {
                System.out.println(de);
            }
        }
        src.close();

    }
}
