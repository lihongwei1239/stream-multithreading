package com.multithreading._01_oneObjectTwoLock;

//在两个线程访问同一个对象中的同步方法时一定是线程安全
public class Run {

    public static void main(String[] args){
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(numRef);
        threadA.start();
        ThreadB threadB = new ThreadB(numRef);
        threadB.start();
    }

}
