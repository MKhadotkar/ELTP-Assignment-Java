package LanguageFundamentals;
import java.util.Scanner;

public class assig1 {

	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter three number : ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		System.out.println(calMax(a,b,c));
		
	}
	
	public static int calMax(int a,int b, int c)
	{
		
		return Math.max(a, Math.max(c, b));
	}

}
