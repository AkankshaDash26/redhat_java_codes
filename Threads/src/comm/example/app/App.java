package comm.example.app;


import comm.example.PrintThread;
import comm.example.ThreadTest;

public class App {
	
	public static void main(String[] args)
	{
	 /*
		ThreadTest test=new ThreadTest();
		Thread t=new Thread(test);
		System.out.println(t.getName());
		t.start();
		Thread t1=new Thread(test);
		System.out.println(t1.getName());
		t1.start();
	 */
		PrintThread t1=new PrintThread("A");
		t1.start();
		PrintThread t2=new PrintThread("B");
		t2.start();
	}

}