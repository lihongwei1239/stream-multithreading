package com.multithreading._01.stopThread;

/**
 * 使用抛异常的方法停止线程
 * Created by lihongwei1239 on 2017/7/16.
 */
public class MyThread03 extends Thread {

    @Override
    public void run() {
        super.run();
        try{
            for (int i = 0; i < 500000; i++) {
                if(this.isInterrupted()){
                    System.out.println("已经是停止状态了！我要退出了!");
                    throw  new InterruptedException();
                }
                System.out.println("i="+(i+1));
            }
            System.out.println("我被输出，如果此代码是for又继续运行，线程并未停止!");
        }catch (InterruptedException e){
            System.out.println("进入MyThread03.java类run方法中的catch了！");
        }

    }

    public  static void main(String[] args){
        try {
            MyThread03 thread = new MyThread03();
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
