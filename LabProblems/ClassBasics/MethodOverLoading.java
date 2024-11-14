package LabProblems.ClassBasics;

// Write a JAVA program to calculate the area of different shapes namely circle, rectangle, and
// triangle using the concept of method overloading.

import java.util.Scanner;

class Shape {
    void calcArea(int r){
        System.out.println("Area is: " + (3.14*r*r));
        System.out.println();
    }
    void calcArea(int l, int b){
        System.out.println("Area is: " + (l*b));
        System.out.println();
    }
    void calcArea(double b, double h){
        System.out.println("Area is: " + (b*h)*0.5);
        System.out.println();
    }
}

class MethodOverLoading {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        Shape shape = new Shape();
        boolean check = true;
        while(check){
            System.out.println("1)Circle\n2)Rectangle\n3)Triangle\n4)EXIT");
            System.out.print("Enter the Shape to Calculate Area: ");
            int s = src.nextInt();
            switch(s){
                case 1:
                    System.out.print("Enter the Radius of the Circle: ");
                    int r = src.nextInt();
                    shape.calcArea(r);
                    break;
                case 2:
                    System.out.print("Enter the Length of the Rectangle: ");
                    int l = src.nextInt();
                    System.out.print("Enter the Breadth of the Rectangle: ");
                    int b = src.nextInt();
                    shape.calcArea(l,b);
                    break;
                case 3:
                    System.out.print("Enter the Base of the Triangle: ");
                    double base = src.nextInt();
                    System.out.print("Enter the Height of the Triangle: ");
                    double height = src.nextInt();
                    shape.calcArea(base,height);
                    break;
                case 4:
                    check = false;
                    break;
                default:
                    System.out.println("Enter Valid Operation!");
            }
        }
        src.close();
    }
}
