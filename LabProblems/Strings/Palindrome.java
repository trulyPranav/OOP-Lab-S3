package LabProblems.Strings;

// Write a Java program that checks whether a given string is a palindrome or not.
// Ex: MALAYALAM is palindrome.

import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = src.next();
        int flag = 0;
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i) != word.charAt(word.length()-1-i)){
                flag = 1;
                break;
            }
        }
        if(flag == 1)
            System.out.println("Given word is not a Palindrome");
        else
            System.out.println("Given word is a Palindrome!");
        src.close();
    }
}
