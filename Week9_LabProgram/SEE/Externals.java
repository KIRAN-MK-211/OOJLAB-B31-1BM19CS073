package SEE;

import java.util.*;
public class Externals 
{
	public static int index=0;
	
	public double SEE[] = new double[5];
	Scanner in = new Scanner(System.in);
	public void input()
	{
		int i;
		
		System.out.println("Enter the SEE Marks of all subjects in the same order");
		for(i=0;i<5;i++)
		{
			System.out.println("Enter the SEE Marks of subject "+(i+1)+":");
			SEE[i] = in.nextDouble();
			SEE[i] = SEE[i]/2;
		}
		
	}
	public void display(String name1,String USN1)
	{
		System.out.println("Marks of Student with name: "+name1+" and USN :"+USN1+"::::===");
	}
	public void calc(int cie)
	{
		if(index==5)
			index = 0;
		
		double total = cie + SEE[index];
		index++;
		
		System.out.println("Marks in Subject "+(index)+" : "+total);
	}
}
