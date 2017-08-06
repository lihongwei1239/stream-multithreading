package com.multithreading.stopThread;

/**
 * 失败  线程停止方法失败
 * Created by lihongwei1239 on 2017/7/16.
 */
public class MyThread02 extends Thread {

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            if(this.isInterrupted()){
                System.out.println("已经是停止状态了！我要退出了!");
                break;
            }
            System.out.println("i="+(i+1));
        }
        System.out.println("我被输出，如果此代码是for又继续运行，线程并未停止!");
    }

    public  static void main(String[] args){
        try {
            MyThread02 thread = new MyThread02();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
        }catch (InterruptedException e){
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
