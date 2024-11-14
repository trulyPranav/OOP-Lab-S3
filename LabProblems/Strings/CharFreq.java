package LabProblems.Strings;

// Write a Java Program to find the frequency of a given character in a string.

import java.util.Scanner;

class CharFreq {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = src.next();
        System.out.print("Enter the Character whose Frequency is to be found: ");
        char letter = src.next().charAt(0);
        int count = 0;
        for(int i=0; i<word.length(); i++){
            if(letter == word.charAt(i))
                count++;
        }
        System.out.println("The Character " + letter + " occurs " + count + " times in the word " + word);
        src.close();
    }
}
