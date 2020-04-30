
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MultiThread implements Runnable{
    boolean val=false;
    public void run(){
        int i=0;
        while(i<5){
        if(val){
            System.out.println(Thread.currentThread().getName());
            val=false;
        }
        else{
            System.out.println(Thread.currentThread().getName()+" in Else");
            val=true;
        }
        i++;
        }
    }
    public static void main(String args[]){
        for(int i=0;i<4;i++){
            Thread obj=new Thread(new MultiThread());
            obj.start();
            Multi m=new Multi();
            m.start();
        }
    }
}
public class Multi extends Thread{
    boolean val= false
    public void run(){
        int i=0;
        while(i<5){
        if(val){
            System.out.println(Thread.currentThread().getName());
            val=false;
        }
        else{
            System.out.println(Thread.currentThread().getName()+" in Else");
            val=true;
        }
        i++;
        }
    }
}
    

/*
Thread 11 value:-10
Thread 10 value:-10
Thread 12 value:-10
Thread 11 value:-11
Thread 10 value:-11
Thread 13 value:-10
Thread 14 value:-10
Thread 12 value:-11
Thread 14 value:-11
Thread 13 value:-11
*/
