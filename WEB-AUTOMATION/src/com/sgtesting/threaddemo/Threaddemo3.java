package com.sgtesting.threaddemo;
class MyThread3 implements Runnable
{
	public void run()
	{
		displayevennumbers();
	}
	synchronized void displayevennumbers()
	{
		try
		{
			for(int i=20;i<=40;i++)
			{
				if(i%2==0)
				{
					Thread.sleep(1000);
					System.out.println(Thread.currentThread().getName()+"EvenNumber"+i);
				}
				
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
	
public class Threaddemo3
{

	public static void main(String[] args)
	{
		MyThread3 job=new MyThread3();
		Thread t1=new Thread(job);
		Thread t2=new Thread(job);
		t1.setName("alpha");
		t2.setName("omega");
		t1.start();
		t2.start();

	}

}
