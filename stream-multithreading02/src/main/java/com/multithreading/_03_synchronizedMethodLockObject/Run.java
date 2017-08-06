package com.multithreading._03_synchronizedMethodLockObject;

//调用关键字synchronized声明的方法一定是排队运行的。另外需要牢牢记住"共享"这两个字，只有共享资源的读写访问才需要同步化
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
