package com.example.demo;

public class ThreadDemo implements Runnable {

    public  int sum=10;
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            try {
                System.out.println("当前线程是："+Thread.currentThread()+"sum的值是："+sum);
                sum--;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        ThreadDemo threadDemo=new ThreadDemo();
        Thread t1=new Thread(threadDemo);
        Thread t2=new Thread(threadDemo);
        Thread t3=new Thread(threadDemo);
        t1.start();
        t2.start();
        t3.start();
    }
}
