package com.multithreading.stopThread;

/**
 * Created by lihongwei1239 on 2017/7/16.
 */
public class MyThread01 extends Thread {

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            System.out.println("i="+(i+1));
        }
    }

   /* public  static void main(String[] args){
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
            System.out.println("是否停止1 ?"+thread.isInterrupted());
            System.out.println("是否停止2 ?"+thread.isInterrupted());
        }catch (Exception e){
            System.out.println("main catch");
            e.printStackTrace();
        }
    }*/

   public static void main(String[] args){
       Thread.currentThread().interrupt();
       System.out.println("是否停止1 ?"+Thread.interrupted());
       System.out.println("是否停止2 ?"+Thread.interrupted());
   }

}
