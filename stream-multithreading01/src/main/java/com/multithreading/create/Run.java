package com.multithreading.create;

/**
 * Created by lihongwei1239 on 2017/7/16.
 */
public class Run {

    public  static void main(String[] args){
        Thread thread = new Thread(new MyRunnable());
        thread.start();
        System.out.println("线程运行结束");
    }

}
