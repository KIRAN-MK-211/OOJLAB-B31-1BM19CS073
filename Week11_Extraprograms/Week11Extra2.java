import java.util.Random;
class NewThread implements Runnable 
{
	String name; 
	int num;
	Thread t;
	NewThread(String threadname,int num1)
	{
		name = threadname;
		num = num1;
		t = new Thread(this, name);
		t.start(); 
	}
	
	public void run() 
	{
		try 
		{
			if(name.equals("Two"))
				System.out.println(num*num);
			else if(name.equals("Three"))
				System.out.println(num*num*num);
			
			else
			{
			}
			Thread.sleep(1000);
		} 
		catch(InterruptedException e) 
		{
				System.out.println(name + "Interrupted");
		}

	}
}

class Week11Extra2
{
	public static void main(String args[]) 
	{
		Random rand = new Random();
		int c=1;
		while(c<=5)
		{
			new NewThread("One",0); // start threads
			try 
			{
				int rn = rand.nextInt(100); 
				Thread.sleep(1000);
				if(rn%2==0)
					new NewThread("Two",rn);
				else
					new NewThread("Three",rn);
			} 
			catch (InterruptedException e) 
			{
				System.out.println("Main thread Interrupted");
			}
			c++;
		}
		System.out.println("Main thread exiting.");
	}
}
