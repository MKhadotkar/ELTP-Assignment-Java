package StringManipulationAndArrays;
import java.util.Scanner;

public class assig4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String : ");
		String str=sc.nextLine();
		
		System.out.println("String with Reversed word : ");
		System.out.println(makeReverse(str));
	}
	
	public static String makeReverse(String str)
	{
		String str1[]=str.split(" ");
		String res=new String();
		for(String s:str1)
		{
			res+=new StringBuffer(s).reverse().toString();
			
			res+=" ";
		}
		
		return res;
		
		
	}

}
