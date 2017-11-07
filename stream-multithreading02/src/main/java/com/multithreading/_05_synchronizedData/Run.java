package com.multithreading._05_synchronizedData;


public class Run {

    public static void main(String[] args){
        try {
            PublicVer object = new PublicVer();
            ThreadA threadA = new ThreadA(object);
            threadA.start();
            Thread.sleep(200);
            object.getValue();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
