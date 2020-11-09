import java.util.*;
class Player
{
  String name;
  double average;
  int no_of_matches;
  Scanner in= new Scanner(System.in);
  Player()
  {
    System.out.println("======================================");
    System.out.println("Enter the name of the player");
    name = in.nextLine();
    System.out.println("Enter the number of matches played by the player");
    no_of_matches = in.nextInt();
  }
}
class Batsman extends Player
{
  int runs_scored;
  Scanner in = new Scanner(System.in);
  Batsman()
  {
    super();
  }
  void inp()
  {
    System.out.println("Enter the no of runs scored");
    runs_scored = in.nextInt();
  }
  void calc()
  {
    System.out.println("Details: ");
    System.out.println("Name: "+name);
    System.out.println("Player type: Batsman");
    System.out.println("Average: "+((double)runs_scored/no_of_matches));

  }
}
class Bowler extends Player
{
  int runs_given;
  Scanner in = new Scanner(System.in);
  Bowler()
  {
    super();
  }
  void inp()
  {

    System.out.println("Enter the no of runs given");
    runs_given = in.nextInt();
  }
  void calc()
  {
    System.out.println("=============================");
    System.out.println("Details: ");
    System.out.println("Name: "+name);
    System.out.println("Player type: Bowler");
    System.out.println("Average: "+((double)runs_given/no_of_matches));

  }

}
class PlayerMain
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int m,n;
    System.out.println("Enter the no of batsmen and bowlers");
    m = in.nextInt();
    n = in.nextInt();
    Batsman bt[] = new Batsman[m];
    Bowler bw[] = new Bowler[n];
    System.out.println("Enter the details of batsmen");
    for(int i = 0;i<m;i++)
    {
      bt[i] = new Batsman();
      bt[i].inp();
    }
    System.out.println("Enter the details of bowlers");
    for(int i=0;i<n;i++ )
    {
      bw[i] = new Bowler();
      bw[i].inp();
    }
    System.out.println("The details are: ===============");
    for(int i = 0;i<m;i++)
    {
      bt[i].calc();
    }
    for(int i = 0;i<n;i++)
    {
      bw[i].calc();
    }
  }
}
