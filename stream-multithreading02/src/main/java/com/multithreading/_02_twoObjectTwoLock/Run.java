package com.multithreading._02_twoObjectTwoLock;

//在两个线程分别访问同一个类的两个不同实例的相同名称的同步方法，效果却是以异步的方式运行
//关键字synchronized取的锁都是对象锁，而不是把一段代码或者方法当做锁
public class Run {

    public static void main(String[] args){
        HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();
        HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(numRef1);
        threadA.start();
        ThreadB threadB = new ThreadB(numRef2);
        threadB.start();
    }

}
