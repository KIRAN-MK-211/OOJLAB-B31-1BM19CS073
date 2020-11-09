/*
Develop a Java program to create a class Actor with id, name, no_of_movies,
no_of_years_exp. Calculate the average_performance for each of the actor and print
the name of the actor with highest average.
*/
import java.util.*;
class actor
{
  String id,name;
  int no_of_movies,no_of_years;
  double average_performance;
  static double highavg=0;
  static int index = -1;
  Scanner in = new Scanner(System.in);

  void accept(int i)
  {

    System.out.println("========Enter data of Actor :"+(i+1)+"========");
    System.out.println("Enter the ID of actor:");
    id = in.next();
    System.out.println("Enter the name of actor:");
    name = in.next();
    System.out.println("Enter the no of movies acted:");
    no_of_movies = in.nextInt();
    System.out.println("Enter the experience in years");
    no_of_years = in.nextInt();
    index = i;
  }
  void cal(int i)
  {
    average_performance = (double)no_of_movies/no_of_years;
    if(highavg > average_performance)
    {
      highavg = this.average_performance;
      index = i;
    }
  }
  void display(String ID,String NAME, double avg)
  {
    System.out.println("The actor with highest average");
    System.out.println("ID: "+ID);
    System.out.println("Name :"+NAME);
    System.out.println("Average:"+avg);
  }
}
class act
{
  public static void main(String args[])
  {
    int n,i;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the no of actors");
    n = in.nextInt();
    actor a[] = new actor[n];
    for(i=0;i<n;i++)
    {
      a[i] = new actor();
      a[i].accept(i);
      a[i].cal(i);
    }
    int ii = a[n-1].index;
    a[ii].display(a[ii].id, a[ii].name, a[ii].average_performance);
  }
}
