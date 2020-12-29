/*Develop a Java program to find the transpose of a given matrix of order MXN.*/
import java.util.*;
class transpose
{
  public static void main(String args[])
  {
    int m,n,i,j;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the values of m and n");
    m = in.nextInt();
    n = in.nextInt();
    int a[][] = new int[m][n];
    int a_t[][] = new int[n][m];
    System.out.println("Enter the elements of the matrix");
    for(i=0;i<m;i++)
    {
      System.out.println("elements of row "+(i+1));
      for(j=0;j<n;j++)
      {
        a[i][j] = in.nextInt();
      }
    }
    for(i=0;i<n;i++)
    {
      for(j=0;j<m;j++)
      {
        a_t[i][j] = a[j][i];
        System.out.print(a_t[i][j]+" ");
      }
      System.out.println();
    }
  }
}
