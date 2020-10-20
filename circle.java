/*
*Develop a Java program which has the (only) class CircleDemo that has members-
radius, area and perimeter. Include methods to do the following.

a. accept the radius from the user
b. find the area of the circle
c. find the perimeter of the circle
d. Display all the details
*/
import java.util.*;
class CircleDemo
{
  double radius, area, perimeter, pi = 3.14159;
  public static void main(String args[])
  {
    CircleDemo ob = new CircleDemo();
    ob.accept();
    ob.area();
    ob.perimeter();
    ob.display();
  }
  void accept()
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the radius of the circle");
    radius = in.nextDouble();
  }
  void area()
  {
    area = pi * radius * radius;
  }
  void perimeter()
  {
    perimeter = 2*pi*radius;
  }
  void display()
  {
    System.out.println("Area of the circle = "+area+" sq. units");
    System.out.println("Perimeter of the circle = "+perimeter+" units");
  }
}
