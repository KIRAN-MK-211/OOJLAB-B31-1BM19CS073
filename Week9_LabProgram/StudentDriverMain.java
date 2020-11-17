import CIE.*;
import SEE.*;
import java.util.*;
class StudentDriverMain
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int n,i;
		System.out.println("Enter the no of students");
		n = in.nextInt();
		CIE.Student stn[] = new CIE.Student[n];
		CIE.Internals ils[] = new CIE.Internals[n];
		SEE.Externals els[] = new SEE.Externals[n];
		for(i=0;i<n;i++)
		{
			stn[i] = new CIE.Student();
			ils[i] = new CIE.Internals();
			els[i] = new SEE.Externals();
			System.out.println("Enter the details of student "+(i+1)+":");
			stn[i].input();
			ils[i].inp();
			els[i].input();
		}
		System.out.println("=============================\nDETAILS OF ALL STUDENTS\n===============================");
		for(i=0;i<n;i++)
		{
			System.out.println("======Details of student "+(i+1)+":");
			els[i].display(stn[i].name,stn[i].USN);
			for(int j=0;j<5;j++)
			{
				els[i].calc(ils[i].CIE[j]);
			}
		}
	}
}
