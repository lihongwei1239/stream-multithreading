package com.multithreading._03_synchronizedMethodLockObject;


public class MyObject {

    public synchronized void methodA(){
        try{
            System.out.println("begin methodA threadName="+ Thread.currentThread().getName());
            Thread.sleep(1000);
            System.out.println("end");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
