package StringManipulationAndArrays;
import java.util.Scanner;

public class assig5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter source String");
		
		String str=sc.nextLine();
		
		System.out.println("Enter string which you want to replace : ");
		
		String str1=sc.nextLine();
		
		System.out.println("Enter string with which you want to replace : ");
		
		String str2=sc.nextLine();
		
		System.out.println(str.replaceAll(str1, str2));
		
	}

}
