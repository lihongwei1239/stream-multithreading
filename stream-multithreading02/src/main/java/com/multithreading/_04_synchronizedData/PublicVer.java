package com.multithreading._04_synchronizedData;

public class PublicVer {

    public String username = "A";
    public String password = "AA";

    synchronized  public void setValue(String username,String password){
        try{
            this.username = username;
            Thread.sleep(1000);
            this.password = password;
            System.out.println("setValue method thread name= "+Thread.currentThread().getName()+",username = "+username+",password = "+password);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //数据存在脏读
    /*public void getValue(){
        System.out.println("getValue method thread name= "+Thread.currentThread().getName()+",username = "+username+",password = "+password);
    }*/

    //使用同步去除数据出现脏读情况
    synchronized public void getValue(){
        System.out.println("getValue method thread name= "+Thread.currentThread().getName()+",username = "+username+",password = "+password);
    }
}
