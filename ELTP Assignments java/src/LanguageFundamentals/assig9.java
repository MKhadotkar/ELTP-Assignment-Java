package LanguageFundamentals;
import java.util.Scanner;

public class assig9 {

	public static void main(String[] args) {
		
		int a;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter charges : ");
		a=sc.nextInt();
		
		System.out.println("Pay back amount : Rs. "+calPayBack(a));
		
		
	}
	
	public static double calPayBack(int a)
	{
		if(a<=500)
		{
			return (a*0.0025);
		}
		else if(a>500 && a<=1500)
		{
			return (a*0.0050);
		}
		else if(a>1500 && a<=2500)
		{
			return (a*0.0075);
		}
		else
		{
			return (a*0.01);
		}
		
	}

}
