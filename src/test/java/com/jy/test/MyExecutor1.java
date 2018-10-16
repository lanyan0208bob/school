package com.jy.test;


public class MyExecutor1 extends MyExecutor{
	
public void testsay(){
	super.myexecutor.submit(new MyThread("俊杰"));
}
	public static void main(String[] args) {
		MyExecutor1 ex1=new MyExecutor1();
		ex1.testsay();
		System.out.println(14);
	}
}
