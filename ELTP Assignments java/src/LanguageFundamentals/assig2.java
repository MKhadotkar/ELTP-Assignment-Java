package LanguageFundamentals;
import java.util.Scanner;

public class assig2 {

	public static void main(String[] args) {
		
		char a;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter alphabate : ");
		a=sc.nextLine().charAt(0);
		
		
		if(checkAlpha(a))
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Not Vowel");
		}
		
	}
	
	public static boolean checkAlpha(char a)
	{
		
		if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
		{
			return true;
		}
		
		return false;
	}

}
