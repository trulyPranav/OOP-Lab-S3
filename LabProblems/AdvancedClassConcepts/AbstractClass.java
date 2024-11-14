package LabProblems.AdvancedClassConcepts;

// Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter().
// Create subclasses Circle and Triangle that extend the Shape class and
// implement the respective methods to calculate the area and perimeter of each shape.

import java.util.Scanner;

abstract class Shape {
    abstract void calculateArea();
    abstract void calculatePerimeter();
}

class Circle extends Shape {
    int radius;
    Circle(int radius){
        this.radius = radius;
    }
    void calculateArea(){
        System.out.println("Area of Circle is: " + (radius*3.14*radius));
    }
    void calculatePerimeter(){
        System.out.println("Perimeter of Cicle is: " + (2*3.14*radius));
    }
}

class Triangle extends Shape {
    int base, height;
    Triangle(int base, int height){
        this.base = base;
        this.height = height;
    }
    void calculateArea(){
        System.out.println("Area of Triangle is: " + (base*height)*0.5);
    }
    void calculatePerimeter(){
        Scanner src = new Scanner(System.in);
        int side1 = src.nextInt(),side2 = src.nextInt();
        src.close();
        System.out.println("Perimeter of Cicle is: " + (side1+side2+base));
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        // Implement the methods
    }
}
