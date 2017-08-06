package com.multithreading.create;

/**
 * 通过实现Runnable接口新建线程  多台
 * Created by lihongwei1239 on 2017/7/16.
 */
public class MyRunnable implements  Runnable {
    public void run() {
        System.out.println("运行中");
    }
}
