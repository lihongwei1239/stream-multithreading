package com.multithreading.object;

/**
 * 实例变量之间不共享数据
 * Created by lihongwei1239 on 2017/7/16.
 */
public class MyThread01 extends Thread{
    private int count =5;

    public MyThread01(String name){
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while(count>0){
            count --;
            System.out.println("由"+this.currentThread().getName()+",计算count="+count);
        }
    }

    public static void main(String[] args){
        MyThread01 threadA = new MyThread01("A");
        MyThread01 threadB = new MyThread01("B");
        MyThread01 threadC = new MyThread01("C");
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
