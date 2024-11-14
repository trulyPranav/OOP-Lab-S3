package LabProblems.Threads;

// Write a Java program to create two threads: One for displaying all odd number between 1 and 100
// and second thread for displaying all even numbers between 1 and 100.


import java.lang.Thread;

class OddThread extends Thread {
    public void run(){
        for(int i=0; i<=100; i++){
            if(i%2 != 0)
                System.out.println("        "+ i);
            try{
                Thread.sleep(100);
            } catch(InterruptedException ie){
                System.out.println("Exception Arised!");
            }
        }
    }
}

class EvenThread extends Thread {
    public void run(){
        for(int i=0; i<=100; i++){
            if(i%2 == 0)
                System.out.println(i);
            try{
                Thread.sleep(100);
            } catch(InterruptedException ie){
                System.out.println("Exception Arised!");
            }
        }
    }
}

class OddAndEvenUsingThreads {
    public static void main(String[] args) {
        OddThread  ot = new OddThread();
        EvenThread et = new EvenThread();
        ot.start();;
        et.start();
    }
}
