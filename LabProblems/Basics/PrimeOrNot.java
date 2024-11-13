package LabProblems.Basics;

// Write a Java program to check whether a given number is prime or not.

import java.util.Scanner;

class PrimeOrNot {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = src.nextInt();
        src.close();
        int flag = 0;
        if(num<0)
            System.out.println("Not a Prime Number since " + num + " is negative!");
        else if(num == 2)
            System.out.println(num + " is a Prime Number!");
        else {
            for(int i=2; i<num/2; i++){
                if(num%i == 0){
                    flag = 1;
                    break;
                }
            }
            if(flag == 1)
            System.out.println(num + " is not a Prime Number.");
            else 
                System.out.println(num + " is a Prime Number!");
        }
    }
}
