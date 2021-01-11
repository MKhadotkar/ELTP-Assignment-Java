package Assignment1;

import java.util.Scanner;

public class assig6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String : ");
		String str=sc.nextLine();
		
		
		String[] str1=str.split(" ");
		
		for(String i : str1)
		{
			System.out.println(i);
		}
		
		sc.close();
		
	}

}
