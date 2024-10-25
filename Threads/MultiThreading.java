package Threads;
import java.lang.Thread;
import java.util.Random;

class ThreadOne extends Thread {
    Random rnd = new Random();
    ThreadTwo t2;

    ThreadOne(ThreadTwo t2) {
        this.t2 = t2;
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                int randomInt = rnd.nextInt(1000);
                System.out.println("Generated Random Int: " + randomInt);
                t2.processNumber(randomInt);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadTwo extends Thread {
    public void processNumber(int number) {
        if (number % 2 == 0) {
            System.out.println("Even: " + number + " | Square: " + (number * number));
        } else {
            System.out.println("Odd: " + number);
        }
    }

    public void run() {
    }
}

class MultiThreading {
    public static void main(String args[]) {
        ThreadTwo t2 = new ThreadTwo();
        ThreadOne t1 = new ThreadOne(t2);
        t1.start();
    }
}
