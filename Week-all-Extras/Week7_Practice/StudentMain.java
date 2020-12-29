import java.util.*;
class Student
{
  String name,usn;
  int sem;
  Scanner in = new Scanner(System.in);
  Student()
  {
    System.out.println("!@#$%^&*()_+=+_)(*&^%$#@!");
    System.out.println("Enter the Name of the student:");
    name = in.next();
    System.out.println("Enter the USN of the student:");
    usn = in.next();
    System.out.println("Enter the semester of the student:");
    sem = in.nextInt();
  }
}
class Test extends Student
{
  int ns,credits[],cie[];
  Scanner in  = new Scanner(System.in);
  Test()
  {
    super();
    int i;
    System.out.println("Enter the no of subjects");
    ns = in.nextInt();
    credits = new int[ns];
    cie = new int[ns];
    for(i=0;i<ns;i++)
    {
      System.out.println("Enter the credits alloted to subject "+(i+1));
       credits[i] = in.nextInt();
      System.out.println("Enter the CIE marks in subject "+(i+1));
      cie[i] = in.nextInt();

    }
  }

}
class Exam extends Test
{
  int see[] = new int[ns];
  int i;
  Scanner in  = new Scanner(System.in);
  Exam()
  {
    super();
    int i;

    for(i=0;i<ns;i++)
    {
      System.out.println("Enter the SEE marks in subject "+(i+1));
      see[i] = in.nextInt();
    }
  }

}
class Result extends Exam
{
  double GP=0;
  Result()
  {
    super();

  }
  void calc()
  {
    double mark;
    int totCredits=0;
    for(i=0;i<ns;i++)
    {
      totCredits+=credits[i];
      mark = cie[i]+((double)see[i]/2);
    if(mark>=90&&mark<=100)
      GP = GP + (10*credits[i]);
    else if(mark>=80 && mark<=89)
      GP = GP + (9*credits[i]);
    else if(mark>=70&&mark<=79)
      GP = GP + (8*credits[i]);
    else if(mark>=60&&mark<=69)
      GP = GP + (7*credits[i]);
    else if(mark>=50 && mark<=59)
      GP = GP + (6*credits[i]);
    else if(mark>=40&&mark<=49)
      GP = GP + (5*credits[i]);
    else
        GP = GP;
    }
    GP = GP/totCredits;
  }
  void display(int ind)
  {
    System.out.println("======================================");
      System.out.println("Details of student "+(ind+1));
    System.out.println("Name: "+name);
    System.out.println("USN: "+usn);
    System.out.println("SGPA in semester:"+sem+" : "+GP);
  }
}
class StudentMain
{
  public static void main(String[] args)
  {
    int n,i;
    Scanner in  = new Scanner(System.in);
    System.out.println("Enter the no of students");
    n  = in.nextInt();
    Result r[] = new Result[n];
    System.out.println("Enter the details of all the students");
    for(i=0;i<n;i++)
    {
      r[i] = new Result();
      r[i].calc();
    }
    System.out.println("The details of all students");
    for(i=0;i<n;i++)
    {
      r[i].display(i);
    }
  }
}
