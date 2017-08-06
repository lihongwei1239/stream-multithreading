package com.multithreading.mathod;


/**
 * Created by lihongwei1239 on 2017/7/16.
 */
public class Mythread extends Thread{

    public  Mythread(){
        System.out.println("构造方式的打印："+Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("run方法的打印："+Thread.currentThread().getName());
        System.out.println("run是否活动："+this.isAlive());
    }

    public static void main(String[] args){
        Mythread thread = new Mythread();
        System.out.println("begin==："+thread.isAlive());
        thread.start();
        System.out.println("end==："+thread.isAlive());
    }
}
