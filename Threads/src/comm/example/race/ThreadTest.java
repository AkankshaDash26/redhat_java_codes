package comm.example.race;

public class ThreadTest {
	
	public static void main(String[] args)
	{
		new PrintStringThread("Hello","there");
		new PrintStringThread("How are","you?");
		new PrintStringThread("Thank You","very much");
	}

}