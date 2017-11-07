package com.multithreading._04_synchronizedMethodLockObject2;


public class MyObject {

    public synchronized void methodA(){
        try{
            System.out.println("begin methodA threadName="+ Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end endTime="+System.currentTimeMillis());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //非同步方法methodB
   /* public  void methodB(){
        try{
            System.out.println("begin methodB threadName="+ Thread.currentThread().getName()+" begin Time="+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("end endTime="+System.currentTimeMillis());
        }catch (Exception e){
            e.printStackTrace();
        }
    }*/

   //同步方法methodB
   public synchronized  void methodB(){
        try{
            System.out.println("begin methodB threadName="+ Thread.currentThread().getName()+" begin Time="+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("end endTime="+System.currentTimeMillis());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
