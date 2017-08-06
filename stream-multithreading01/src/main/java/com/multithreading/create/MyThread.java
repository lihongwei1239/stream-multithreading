package com.multithreading.create;

/**
 * Created by lihongwei1239 on 2017/7/16.
 */
public class MyThread extends  Thread {

    @Override
    public void run() {

        try {

            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random()*1000);
                Thread.sleep(time);
                System.out.println("run="+Thread.currentThread().getName());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
