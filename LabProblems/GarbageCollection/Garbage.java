package LabProblems.GarbageCollection;

// Write a Java program to demonstrate the use of garbage collector.

class Garbage {
    protected void finalize(){
        System.out.println("Garbage Collection Performed Successfully!");
    }
    public static void main(String[] args) {
        Garbage g1 = new Garbage();
        g1 = null;
        System.gc();
    }
}
