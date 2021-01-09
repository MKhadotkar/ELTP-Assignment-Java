package LanguageFundamentals;
import java.util.Scanner;

public class assig6 {

	public static void main(String[] args) {
		
		int a,b;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter start point and end point : ");
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.println("Prime number between "+a+" to "+b+" : ");
		for (int i = a; i <=b; i++)
		{
			if(isPrimeNumber(i))
			{
				System.out.println(i);
			}
		}
			
		
		
		
	}
	
	public static boolean isPrimeNumber(int a)
	{
		
		if(a==1 || a==0)
		{
			return false;
		}
		else
		{
			int flag=0;
			for (int i = 2; i < a; i++)
			{
				if(a%i==0)
				{
					flag=1;
					break;
				}
			}
			
			if(flag==0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}

}
