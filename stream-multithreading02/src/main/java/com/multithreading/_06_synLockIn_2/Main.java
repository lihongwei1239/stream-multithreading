package com.multithreading._06_synLockIn_2;

public class Main {

    public int  i = 10;
    synchronized public void operateMainMethod(){
        try{
            i--;
            System.out.println("main print i="+i);
            Thread.sleep(100);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
