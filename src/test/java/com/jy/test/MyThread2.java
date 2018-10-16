package com.jy.test;

import org.springframework.beans.factory.annotation.Autowired;

public class MyThread2 extends Thread{
	@Autowired
private String namec;

public String getNamec() {
	return namec;
}

public void setNamec(String namec) {
	this.namec = namec;
}

public MyThread2(String namec) {
	super();
	this.namec = namec;

}public MyThread2() {
	// TODO Auto-generated constructor stub
}
@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
public static void main(String[] args) {
	
}
}
