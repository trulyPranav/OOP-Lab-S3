package LabProblems.Strings;

// Write a Java program to sort an array of strings in alphabetical order.

import java.util.Scanner;

class StringSort {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter the Number of Strings to sort: ");
        int num = src.nextInt();
        String array[] = new String[num];
        System.out.println("Enter the Strings: ");
        for(int i=0; i<num; i++)
            array[i] = src.next();
        String temp = "";
        for(int i=0; i<num-1; i++){
            for(int j=0; j<num-i-1; j++){
                if(array[j].compareTo(array[j+1]) > 1){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.print("Sorted Words: ");
        for(String word: array)
            System.out.print(word + " ");
        src.close();
    }
}
