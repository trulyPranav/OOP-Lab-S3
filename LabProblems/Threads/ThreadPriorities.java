package LabProblems.Threads;

//Write a Java program that shows thread priorities.

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println(getName() + " with priority " + getPriority() + " started.");

        for (int i = 0; i < 5; i++) {
            System.out.println(getName() + " is working...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(getName() + " with priority " + getPriority() + " finished.");
    }
}

class ThreadPriorities {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread-1");
        MyThread thread2 = new MyThread("Thread-2");
        MyThread thread3 = new MyThread("Thread-3");

        // Set priorities: MIN_PRIORITY (1), NORM_PRIORITY (5), MAX_PRIORITY (10)
        thread1.setPriority(Thread.MIN_PRIORITY);  // Priority 1
        thread2.setPriority(Thread.NORM_PRIORITY); // Priority 5
        thread3.setPriority(Thread.MAX_PRIORITY);  // Priority 10

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("Main thread priority: " + Thread.currentThread().getPriority());
    }
}
