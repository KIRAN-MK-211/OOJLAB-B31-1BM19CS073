package CIE;
import java.util.*;
public class Internals  
{
	public int CIE[] = new int[5];
	Scanner in = new Scanner(System.in);
	public void inp()
	{
		int i;
		System.out.println("Enter the CIE marks of 5 subjects");
		for(i=0;i<5;i++)
		{
			System.out.println("Enter marks of subject "+(i+1)+":");
			CIE[i] = in.nextInt();
			
		}
	}
}
