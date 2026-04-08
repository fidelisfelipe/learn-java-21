package br.com.java.threads;
class Counter {
private int count = 0;
public synchronized void increment(){
    count++;
}

public int getCount() {
    return count;
}
}

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
    public static void main(String[] args) throws InterruptedException {
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

        Counter counter = new Counter();

        Thread thread1 = new Thread(() -> {
            System.out.println("Thread " + Thread.currentThread().getName() + " is increment.");
            for (int i = 0; i < 2000; i++) {
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread " + Thread.currentThread().getName() + " is increment.");
            for (int i = 0; i < 2000; i++) {
                counter.increment();
            }
        });

        Thread thread3 = new Thread(() -> {
            System.out.println("Thread " + Thread.currentThread().getName() + " is increment.");
            for (int i = 0; i < 2000; i++) {
                counter.increment();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();// neste ponto o programa espera a thread1 terminar para continuar a execução, garantindo que o resultado final seja consistente
        thread2.join();// neste ponto o programa espera a thread2 terminar para continuar a execução, garantindo que o resultado final seja consistente
        thread3.join();// neste ponto o programa espera a thread3 terminar para continuar a execução, garantindo que o resultado final seja consistente

        System.out.println("Final count: " + counter.getCount());

    }
}
