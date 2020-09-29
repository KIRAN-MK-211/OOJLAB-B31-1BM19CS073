import java.util.*;
public class Quadratic
 {
	public static void main (String[] args)
    {
		double a,b,c,d,r1,r2;
		Scanner in = new Scanner(System.in);
		System.out.println("This program finds roots of the quadratic equation of the form ax^2 + bx + c");
		System.out.println("Enter the values of coefficients of x^2,x and constant");
		a = in.nextDouble();
		b = in.nextDouble();
		c = in.nextDouble();
		d = b*b - 4*a*c;
		b = b/(2*a);
		if(d>0)
		{
			d = Math.sqrt(d)/(2*a);
			r1 = -b-d;
			r2 = -b+d;
			System.out.println("Roots are real and unequal:");
			System.out.printf("%.4f and %.4f",r1,r2);	
		}
		else if(d==0)
		{
			System.out.printf("The roots are real and equal : %.4f",-b);
		}
		else
		
			System.out.println("The roots are imaginary");
			
		
	}
}

