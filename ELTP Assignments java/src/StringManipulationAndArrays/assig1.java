package StringManipulationAndArrays;
import java.util.Scanner;

public class assig1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String : ");
		String str=sc.nextLine();
		
		System.out.println("Enter word : ");
		String word=sc.nextLine();
		
		System.out.println("Occurances of word in string is : "+check(str,word));
	}
	
	public static int check(String str, String word)
	{
		String str1[]=str.split(" ");
		int count=0;
		for(String s:str1)
		{
			if(s.equals(word))
				count++;
		}
		
		return count;
	}

}
