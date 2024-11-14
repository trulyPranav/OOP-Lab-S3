package LabProblems.Strings;

// Write a Java program to reverse a given string.

import java.util.Scanner;

class StringReverse {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = src.next();
        char[] revStringArray = new char[word.length()];
        for(int i=0; i<word.length(); i++){
            revStringArray[i] = word.charAt(word.length()-i-1);
        }
        String revWord = new String(revStringArray);
        System.out.print("Reversed Word is: " + revWord);
        src.close();
    }
}
