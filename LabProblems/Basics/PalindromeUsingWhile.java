package LabProblems.Basics;

// Write a JAVA Program to check if a number is Palindrome or not using while loop.

import java.util.Scanner;

class PalindromeUsingWhile {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        String num = src.next();
        int i = 0, flag = 0;
        while(i<num.length()){
            if(num.charAt(i)!=num.charAt(num.length()-1-i)){
                flag = 1;
                break;
            }
            i++;
        }
        if(flag == 1)
            System.out.println("Not a Palindrome");
        else
            System.out.println("Palindrome");
        src.close();
    }
}
