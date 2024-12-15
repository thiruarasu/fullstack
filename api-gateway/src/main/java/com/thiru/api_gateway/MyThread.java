package com.thiru.api_gateway;

class example extends Thread

{
	public void run()
	{
		System.out.println("Extending Thread class");
	}
}

class Myrunning implements Runnable
{
	
@Override
	public void run()
	{
	System.out.println("Implement runnable interface");
	}
}


public class MyThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 example obj=new example();
 obj.start();
 
 Myrunning myrun=new Myrunning();
 
 Thread Thread1=new Thread(myrun);
 Thread1.start();
	
	}
}

