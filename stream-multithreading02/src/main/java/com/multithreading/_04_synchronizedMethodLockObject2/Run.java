package com.multithreading._04_synchronizedMethodLockObject2;

//A线程先持有object对象的Lock锁，B线程可以以异步方式调用object对象中的非synchronized方法
//A线程先持有object对象的Lock锁，B线程如果在这时调用object对象中的synchronized类型方法则需等待，也就是同步
public class Run {

    public static void main(String[] args){
        MyObject object = new MyObject();
        ThreadA threadA = new ThreadA(object);
        threadA.setName("A");
        threadA.start();
        ThreadB threadB = new ThreadB(object);
        threadB.setName("B");
        threadB.start();
    }

}
