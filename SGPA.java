import java.util.*;
class Student
{
	private String USN;
	private String name;
	private int n;
	private double GP = 0;
	private int totCredits = 0;
	Scanner in = new Scanner(System.in);
	
	void Details()
	{
	System.out.println("Enter the USN of the student");
	USN = in.nextLine();
	System.out.println("Enter the name of the student");
	name = in.nextLine();
	System.out.println("Enter the no of subjects");
	n = in.nextInt();
	int credits[] = new int[n];
	double marks[] = new double[n];
	System.out.println("Enter the details of the subjects:");
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter the credits allotted to the subject "+(i+1));
		credits[i] = in.nextInt();
		System.out.println("Enter the marks of the subject "+(i+1));
		marks[i] = in.nextInt();
		Calculate(credits[i],marks[i]);
	}
    }
    void Calculate(int credit,double mark)
    {
		totCredits = totCredits + credit;
		if(mark>=90&&mark<=100)
			GP = GP + (10*credit);
		else if(mark>=80 && mark<=89)
			GP = GP + (9*credit);
		else if(mark>=70&&mark<=79)
			GP = GP + (8*credit);
		else if(mark>=60&&mark<=69)
			GP = GP + (7*credit);
		else if(mark>=50 && mark<=59)
			GP = GP + (6*credit);
		else if(mark>=40&&mark<=49)
			GP = GP + (5*credit);
		else
			GP = GP;
	}
	void Display()
	{
		System.out.println("Details of the student");
		System.out.println("Name :"+name);
		System.out.println("USN: "+USN);
		System.out.println("SGPA of student "+(GP/totCredits));
	}
}
class StudentMain
{
	public static void main(String []args)
	{
		Student s1 = new Student();
		s1.Details();
		s1.Display();
	}
}
