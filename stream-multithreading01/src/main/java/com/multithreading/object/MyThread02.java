package com.multithreading.object;

/**
 * 共享数据 存在线程不安全的情况 synchronized同步方法
 * Created by lihongwei1239 on 2017/7/16.
 */
public class MyThread02 extends  Thread{
    private int count = 5;

    @Override
    public synchronized void run() {
        super.run();
        while(count>0){
            count --;
            System.out.println("由"+this.currentThread().getName()+",计算count="+count);
        }
    }
    public  static void main(String[] args){
        MyThread02 thread = new MyThread02();
        Thread a = new Thread(thread,"a");
        Thread b = new Thread(thread,"b");
        Thread c = new Thread(thread,"c");
        Thread d = new Thread(thread,"d");
        Thread e = new Thread(thread,"e");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
