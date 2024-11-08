package Threads;
import java.lang.Thread;
import java.util.Random;

class ThreadOne extends Thread {
    Random rnd = new Random();
    ThreadTwo t2;
    ThreadThree t3;

    ThreadOne(ThreadTwo t2, ThreadThree t3) {
        this.t2 = t2;
        this.t3 = t3;
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                int randomInt = rnd.nextInt(1000);
                System.out.println("Generated Random Int: " + randomInt);
                t2.processNumber(randomInt);
                t3.processNumber(randomInt);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadTwo extends Thread {
    public void processNumber(int number) {
        if (number % 2 == 0)
            System.out.println("Even: " + number + " | Square: " + (number * number));

    }

    public void run() {
    }
}

class ThreadThree extends Thread {
    public void processNumber(int number) {
        if(number % 2 != 0)
            System.out.println("Odd: " + number + " | Cube: " + (number * number * number));            
    }

    public void run() {
    }
}

class MultiThreading {
    public static void main(String args[]) {
        ThreadThree t3 = new ThreadThree();
        ThreadTwo t2 = new ThreadTwo();
        ThreadOne t1 = new ThreadOne(t2,t3);
        t1.start();
    }
}
