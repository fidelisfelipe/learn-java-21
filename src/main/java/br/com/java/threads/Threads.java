package br.com.java.threads;

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " is running.");
    }
}
class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread run " + Thread.currentThread().getName() + " is running.");
    }
}
public class Threads {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        //stage
        System.out.println("Main thread is "+thread.getState());
        thread.start();
        System.out.println("Main thread is running.");
        System.out.println("Main thread is "+thread.getState());

        MyRunnable runnable = new MyRunnable();
        Thread myThread = new Thread(runnable);
        System.out.println("Main thread is "+myThread.getState());
        myThread.start();
        System.out.println("Main thread is running.");
        System.out.println("Main thread is "+myThread.getState());
    }
}
