package com.multithreading._04_synchronizedData;


public class ThreadA extends Thread{

    private PublicVer object;

    public ThreadA(PublicVer object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.setValue("B","BB");
    }
}
