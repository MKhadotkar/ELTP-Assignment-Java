package LanguageFundamentals;
import java.util.Scanner;

public class assig4 {

	public static void main(String[] args) {
		
		int a;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Gross pay : ");
		a=sc.nextInt();
		
		System.out.println("Amount of Tax : "+calTax(a)+"$");
		
		
	}
	
	public static double calTax(int a)
	{
		if(a<=240)
		{
			return (0);
		}
		else if(a>240 && a<=480)
		{
			return (a*0.15);
		}
		else
		{
			return (a*0.28);
		}
		
	}

}
