package com.multithreading.stopThread;

/**
 * Created by lihongwei1239 on 2017/7/16.
 */
public class MyThread04 extends Thread {
    private int i = 0;

    @Override
    public void run() {
        super.run();
        try{
            while (true){
                i++;
                System.out.println("i="+(i+1));
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        try{
            MyThread04 thread = new MyThread04();
            thread.start();
            Thread.sleep(8000);
            thread.stop();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
