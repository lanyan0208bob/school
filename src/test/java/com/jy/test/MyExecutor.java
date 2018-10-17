package com.jy.test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyExecutor {

	public static final ExecutorService myexecutor=Executors.newCachedThreadPool();
	
	public void fun(String name){
		myexecutor.submit(new MyThread(name));
		
//		myexecutor.submit(new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				
//				try {
//					Thread.sleep(50000);
//					System.out.println("!测试走起！！");
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}) ;
		
	}
	public static void play(){
		System.out.println("546456");
	}
	public static void main(String[] args) {
		MyExecutor myExecutorTets=new MyExecutor();
		myExecutorTets.fun("张三999");
		play();
	}
}
