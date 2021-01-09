package LanguageFundamentals;
import java.util.Scanner;

public class assig5 {

	public static void main(String[] args) {
		
		int a;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number : ");
		a=sc.nextInt();
		
		if(isPrimeNumber(a))
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not Prime number");
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
