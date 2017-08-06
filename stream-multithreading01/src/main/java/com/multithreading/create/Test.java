package com.multithreading.create;

/**
 * Created by lihongwei1239 on 2017/7/16.
 */
public class Test {
    public  static void main(String[] args){
        try {
            MyThread thread = new MyThread();
            thread.setName("myThead");
            thread.start();
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random()*1000);
                Thread.sleep(time);
                System.out.println("main="+Thread.currentThread().getName());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
