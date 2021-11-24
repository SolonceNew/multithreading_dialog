package com.company.Netology;

public class Main {

    public static void main(String[] args) {
        final int sleepingTimeBeforeEnd = 15000;

        ThreadGroup mainThreadGroup = new ThreadGroup("main group");

        System.out.println("Создаю потоки...");
        final Thread thread1 = new MyThread(mainThreadGroup, "поток 1");
        final Thread thread2 = new MyThread(mainThreadGroup, "поток 2");
        final Thread thread3 = new MyThread(mainThreadGroup, "поток 3");
        final Thread thread4 = new MyThread(mainThreadGroup, "поток 4");

        startThreads(thread1, thread2, thread3, thread4);

        try {
            Thread.sleep(sleepingTimeBeforeEnd);
        } catch (InterruptedException e) {

        }
        System.out.println("Завершаю все потоки...");
        mainThreadGroup.interrupt();
    }

    private static void startThreads(Thread... threads) {
        for(Thread thread : threads) {
            thread.start();
        }
    }

}
