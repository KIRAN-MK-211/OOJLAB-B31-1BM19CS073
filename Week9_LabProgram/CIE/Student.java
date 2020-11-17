package CIE;
import java.util.*;
public class Student
{
	public String name,USN;
	public int sem;
	Scanner in = new Scanner(System.in);
	public void input()
	{
		System.out.println("============================================");
		System.out.println("Enter the name of the student");
		name = in.next();
		System.out.println("Enter the USN of the student");
		USN = in.next();
		System.out.println("Enter the semester of the student");
		sem = in.nextInt();
	}
}
