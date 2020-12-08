class ThreadTh implements Runnable
{ Thread t;
   int s=0;
   ThreadTh()
   {
		t=new Thread(this, "");
	}
  public void run()
   {
	   try
	   {
		   for(int n=1;n<=99;n+=2)
		   {
			 s+=n;
			 Thread.sleep(50);
		   }
	   }
	   catch(InterruptedException ie)
	   {
		   System.out.println("Child Thread Interrupted");
	   }
	   System.out.println("Sum of odd numbers: "+s);
   }
}

class Week11Extra1
{
	public static void main(String ss[])
	{
		int se=0;
		ThreadTh odd=new ThreadTh();
		odd.t.start();
		try
		{
			for(int n=2;n<=100;n+=2)
			{
				se+=n;
				Thread.sleep(10);
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println("Main Thread interrupted");
		}
		System.out.println("Sum of even numbers: "+se);
	}
}
