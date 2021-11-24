package com.company.Netology;

public class MyThread extends Thread {
     private  int sleepingTime = 3000;

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        try {
            while(!isInterrupted()){
                Thread.sleep(sleepingTime);
                System.out.println("Я " + getName() +". Всем привет!");
            }
        } catch (InterruptedException e) {

        }
    }
}
