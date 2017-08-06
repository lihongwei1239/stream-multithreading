package com.multithreading.daemon;

/**
 * Created by lihongwei1239 on 2017/7/16.
 */
public class MyThread extends Thread {
    private int i =0;

    @Override
    public void run() {
        super.run();
        try{
            while (true){
                i++;
                System.out.println("i="+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public  static void main(String[] args){
        try{
            MyThread thread = new MyThread();
            thread.setDaemon(true);
            thread.start();
            Thread.sleep(5000);
            System.out.println("我离开thread对象也不打印了，也就是停止了");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
