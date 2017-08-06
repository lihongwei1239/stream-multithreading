package com.multithreading.stopThread;

/**
 * Created by lihongwei1239 on 2017/7/16.
 */
public class MyThread05 extends Thread {
    @Override
    public void run() {
        while (true){
            if(this.isInterrupted()){
                System.out.println("停止了");
                return;
            }
            System.out.println("timer："+System.currentTimeMillis());
        }
    }

    public  static void main(String[] args) throws  InterruptedException{
        MyThread05 thread = new MyThread05();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();
    }
}
