package LanguageFundamentals;
import java.util.Scanner;

public class assig7 {

	public static void main(String[] args) {
		
		int a;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of attendees : ");
		a=sc.nextInt();
		
		System.out.println("Income show earns : "+calculateProfit(a)+"$");
		
		
	}
	
	public static float calculateProfit(int a)
	{
		int total_amount = a*5;
		
		return (float)(total_amount-(20+a*0.50));
	}

}
