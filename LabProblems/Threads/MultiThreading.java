package LabProblems.Threads;

// Write a Java program that implements a multi-threaded program which has three threads.
// First thread generates a random integer every 1 second.
// If the value is even, second thread computes the square of the number and prints.
// If the value is odd the third thread will print the value of cube of the number.


import java.lang.Thread;
import java.util.Random;

class ThreadOne extends Thread {
    Random rnd = new Random();

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                int randomInt = rnd.nextInt(1000);
                System.out.println("Generated Random Int: " + randomInt);
                if(randomInt % 2 == 0){
                    ThreadTwo t2 = new ThreadTwo(randomInt);
                    t2.start();
                } else {
                    ThreadThree t3 = new ThreadThree(randomInt);
                    t3.start();
                }
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadTwo extends Thread {
    int number;
    ThreadTwo(int number){
        this.number = number;
    }
    public void run() {
        if (number % 2 == 0)
            System.out.println("Even: " + number + " | Square: " + (number * number) + "\n");
    }
}

class ThreadThree extends Thread {
    int number;
    ThreadThree(int number){
        this.number = number;
    }
    public void run() {
        if(number % 2 != 0)
            System.out.println("Odd: " + number + " | Cube: " + (number * number * number) + "\n");    
    }
}

class MultiThreading {
    public static void main(String args[]) {
        ThreadOne t1 = new ThreadOne();
        t1.start();
    }
}
