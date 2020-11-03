import java.util.*;
class Bank
{
	String name,Accno;
	int type;
	Scanner in = new Scanner(System.in);
	void input()
	{
		System.out.println("Enter your name");
		name = in.next();
		System.out.println("Enter your Account Number");
		Accno = in.next();
		System.out.println("Enter your Account type : 1 for Savings and 2 for current");
		type = in.nextInt();
	}
}
class Savings extends Bank
{
	double deposit,rate = 0.04,withdrawal, balance;
	int days,ch;
	Scanner in = new Scanner(System.in);
	void calc(String nm,String Acc)
	{
		System.out.println("Hello "+nm+" . Account No. :"+Acc);
		System.out.println("Please enter your first balance in Rs.");
		balance  = in.nextDouble();
		for(;;)
		{
			System.out.println("Hello "+nm+" . Account No. :"+Acc);
			System.out.println("What do you want to today?\n Please enter \n1. Deposit\n2.Withdrawal\n3.View Balance\n4.exit");
			ch = in.nextInt();
			switch(ch)
			{
				case 1: System.out.println("Please enter the deposit amount in Rs.");
						deposit = in.nextDouble();
						System.out.println("Please enter the no. of days ");
						days = in.nextInt();
						balance+=deposit;
						balance *= Math.pow((1 + rate/36500),(365*days));
						
						break;
				case 2: System.out.println("Please enter the withdrawal amount in Rs.");
						withdrawal = in.nextDouble();
						System.out.println("Please enter the no. of days ");
						days = in.nextInt();
						if(withdrawal>balance)
							System.out.println("Sorry! Insufficient Balance");
						else
						{
							balance-= withdrawal;
							balance *= Math.pow((1 + rate/36500),(365*days));
						}
						break;
				case 3: System.out.println("Balance: Rs."+balance);
						break;
				default: System.out.println("Thank you for visiting!!");
						 System.exit(0);
						 break;
			}
		}
	}
}
class Current extends Bank
{
	double deposit,withdrawal, balance,minbal=10000;
	int days,ch;
	Scanner in = new Scanner(System.in);
	void calc(String nm,String Acc)
	{
		System.out.println("Hello "+nm+" . Account No. :"+Acc);
		System.out.println("Please enter your first balance in Rs.");
		balance  = in.nextDouble();
		for(;;)
		{
			System.out.println("Hello "+nm+" . Account No. :"+Acc);
			System.out.println("What do you want to today?\n Please enter \n1. Deposit\n2.Withdrawal\n3.View Balance\n4.exit");
			ch = in.nextInt();
			switch(ch)
			{
				case 1: if(balance<minbal)
						{
							System.out.println("Penalty for not maintaining minimum balance : Rs.600");
							balance-= 600;
						}
						System.out.println("Please enter the deposit amount in Rs.");
						deposit = in.nextDouble();
						balance+=deposit;
						break;
				case 2: if(balance<minbal)
						{
							System.out.println("Penalty for not maintaining minimum balance : Rs.600");
							balance-= 600;
						} 
						System.out.println("Please enter the withdrawal amount in Rs.");
						withdrawal = in.nextDouble();
						
						if(withdrawal>balance)
							System.out.println("Sorry! Insufficient Balance");
						else
							balance-= withdrawal;	
												
						break;
				case 3: if(balance<minbal)
						{
							System.out.println("Penalty for not maintaining minimum balance : Rs.600");
							balance-= 600;
						} 
						System.out.println("Balance: Rs."+balance);
						break;
				default: System.out.println("Thank you for visiting!!");
						 System.exit(0);
						 break;
			}
		}
	}
}
class BankMain
{
	public static void main(String args[])
	{
		Bank cust = new Bank();
		cust.input();
		if(cust.type == 1)
		{
			Savings custs = new Savings();
			custs.calc(cust.name,cust.Accno);
		}
		else
		{
			Current custc  = new Current();
			custc.calc(cust.name,cust.Accno);
		}
	}
}
