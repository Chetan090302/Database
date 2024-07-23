package org.example;// Example illustrates multiple threads are executing
// on the same Object at same time without synchronization. 
import java.io.*;
import java.util.Arrays;
class Hello extends Thread
{
    public void run()
    {
        for(int i=0;i<100;i++)
        {
            if(i==10)
            {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(i+" ");
        }
    }
}
class Main {
    public static void main(String[] args) {
        Hello obj=new Hello();
        Hello obj1=new Hello();
        obj.start();
        obj1.start();
    }
}
