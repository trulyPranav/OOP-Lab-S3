package LabProblems.AdvancedClassConcepts;

// Write a Java program to create an outer class called  Computer with an inner class Processor.
// The Processor class should have a method "displayDetails()" that prints the details of the processor (e.g., brand and speed).
// Create an instance of Processor from the Computer class and call the "displayDetails()" method.

class Computer {
    String brand;
    Computer(String brand){
        this.brand = brand;
    }
    class Processor {
        String brand;
        double speed;
        Processor(String brand, double speed){
            this.brand = brand;
            this.speed = speed;
        }
        void displayDetails(){
            System.out.println("Computer name is: " +  Computer.this.brand + "\nProcessor Brand Name is: " + brand + "\nProcessor Speed is: " + speed + "GHz");
        }
    }
}

class InnerClass {
    public static void main(String[] args) {    
        Computer computer = new Computer("HP");
        Computer.Processor processor = computer.new Processor("Intel",1.4);
        processor.displayDetails();
    }
}
