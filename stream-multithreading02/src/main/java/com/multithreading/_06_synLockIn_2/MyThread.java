package com.multithreading._06_synLockIn_2;

import com.multithreading._06_synLockIn_1.Service;

public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        Sub sub = new Sub();
        sub.operateISubMethod();
    }
}
