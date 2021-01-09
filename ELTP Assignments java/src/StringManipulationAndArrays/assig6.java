package StringManipulationAndArrays;
import java.util.Scanner;

public class assig6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter starting point and ending point : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int []arr=findPrime(a,b);
		
		System.out.println("Prime number between "+a+" and "+b+" : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
				
	}
	
	public static int[] findPrime(int a,int b)
	{
		int ar[]=new int[a+b];
		int k=0,flag;
		for(int i=a;i<=b;i++)
		{
			if(i>1)
			{	
				flag=0;
				for(int j=2;j<i;j++)
				{
					if(i%j==0)
					{
						flag=1;
						break;
					}
				}
				
				if(flag==0)
					ar[k++]=i;
			}
		}
		
		int res[]=new int[k];
		for(int i=0;i<res.length;i++)
		{
			res[i]=ar[i];
		}
		
		return res;
	}

}
