package LabProblems.ClassBasics;

// Write a JAVA program to find perimeter of 2 rectangles using constructors.
// (Use Default constructor and Parameterized constructor to initialize values of length, breadth of 2 rectangles respectively)

class Rectangle {
    int length;
    int breadth;
    Rectangle(){
        length = 1;
        breadth = 1;
    }
    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    void calcPerimeter(){
        System.out.println("Perimeter of Rectangle is: " + (length*breadth));
    }
}

class PerimeterUsingConstructor {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(), r2 = new Rectangle(5,2);
        r1.calcPerimeter();
        r2.calcPerimeter();
    }
}
