package PracticeProblems.Threads;
import java.lang.Thread;
import java.util.Random;

// T1 => Will generate Random Numbers
// T2 => It is even? => Square
// T3 => It is odd? => Cube

class ThreadOne extends Thread {
    Random rnd = new Random();

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                    if(i == 5) 
                        wait();
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
        try {
            Thread.sleep(3000);
            for(int i=0; i<10; i++){
                System.out.println("MAIN Thread");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally{
            System.out.println("DONE");
        }
    }
}
