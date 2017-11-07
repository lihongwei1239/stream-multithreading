package com.multithreading._06_synLockIn_2;

public class Sub extends Main {

    synchronized public void operateISubMethod(){
        try{
            while (i > 0){
                i--;
                System.out.println("main print i="+i);
                Thread.sleep(100);
                this.operateMainMethod();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
