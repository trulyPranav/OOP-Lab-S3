package LabProblems.VarArgs;

// Write a JAVA program to calculate the area of different shapes(circle, rectangle, triangle) using variable length arguments.

class VarArgs {
    void calcArea(double... v){
        if(v.length == 1)
            System.out.println("Area of Circle is: " + (2*3.14*v[0]));
        else
            System.out.println("Area of Triangle is: " + (v[0]*v[1])*0.5 );
    }
    void calcArea(int... v){
            System.out.println("Area of Rectangle is: " + (v[0]*v[1]));
    }
}
