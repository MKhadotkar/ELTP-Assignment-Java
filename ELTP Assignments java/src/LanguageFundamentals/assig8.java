package LanguageFundamentals;
import java.util.Scanner;

public class assig8 {

	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter units : ");
		int a=sc.nextInt();
		System.out.println("Enter\n 1 for domestic connection \n 2 for commercial connection ");
		int b=sc.nextInt();
		
		
		System.out.println("Bill in Rs : "+calBill(a,b));
		
		
	}
	
	public static double calBill(int a,int b)
	{
		if(b==1)
		{
			if(a<=100)
			{
				double bill= (a*4);
				if(bill<=250)
				{
					return 250;
				}
				else
				{
					return bill;
				}
			}
			else if(a>100 && a<=300)
			{
				return (a*4.5);
			}
			else if(a>300 && a<=500)
			{
				return (a*4.75);
			}
			else
			{
				return (a*5);
			}
		}
		else
		{
			if(a<=100)
			{
				double bill= (a*4.25);
				if(bill<=350)
				{
					return 350;
				}
				else
				{
					return bill;
				}
			}
			else if(a>100 && a<=300)
			{
				return (a*4.75);
			}
			else if(a>300 && a<=500)
			{
				return (a*5);
			}
			else
			{
				return (a*5.25);
			}
		}
		
		
	}

}
