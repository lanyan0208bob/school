package com.jy.test;

public class MyThread implements Runnable{
private String name;

	public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

	public MyThread(String name) {
	super();
	this.name = name;
}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(4000);
			System.out.println(this.getName()+"!测试走起！！");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println("!测试走起！！");
	}

}
