package PracticeProblems.Examples;

import java.lang.Thread;

class myThread1 extends Thread{
    public void run(){
        for(int i=0; i<5; i++)
            System.out.println("Thread 1");
        try{
            Thread.sleep(9000);
        } catch(InterruptedException ie){
            System.out.println("Handled");
        }
        for(int i=0; i<5; i++)
        System.out.println("Thread 1");
    }
}

class myThread2 implements Runnable{
    public void run(){
        for(int i=0; i<10; i++)
        System.out.println("Thread 2");
    }
}

class Threads {
    public static void main(String[] args) {
        myThread1 m1 = new myThread1();
        myThread2 m2 = new myThread2();
        Thread newthread = new Thread(m2);
        newthread.start();
        m1.start();
    }
}
