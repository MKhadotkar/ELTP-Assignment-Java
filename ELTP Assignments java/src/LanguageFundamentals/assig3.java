package LanguageFundamentals;
import java.util.Scanner;

public class assig3 {

	public static void main(String[] args) {
		
		int a;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter deposit amount : ");
		a=sc.nextInt();
		
		System.out.println("Intrest per year : "+callIntrest(a));
		
		
	}
	
	public static double callIntrest(int a)
	{
		if(a<=1000)
		{
			return (a*0.04);
		}
		else if(a>1000 && a<=5000)
		{
			return (a*0.045);
		}
		else
		{
			return (a*0.05);
		}
		
	}

}
