package comm.example.race;

public class PrintStringThread implements Runnable {

	private Thread thread;
	private String s1;
	private String s2;

	public PrintStringThread(String s1, String s2) {
		this.s1 = s1;
		this.s2 = s2;
		thread=new Thread(this);
		thread.start();

	}

	@Override
	public void run() {

		TwoString.print(s1, s2);
	}

}