package LabProblems.Basics;

// Write a JAVA Program to find the Hypotenuse.

import java.util.Scanner;

class Hypotenuse {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter Base: ");
        int base = src.nextInt();
        System.out.print("Enter Height: ");
        int height = src.nextInt();
        int hypotenuse = (int)(Math.pow((base*base)+(height*height),0.5));
        System.out.println("Hypotenuse is: " + hypotenuse);
        src.close();
    }
}
