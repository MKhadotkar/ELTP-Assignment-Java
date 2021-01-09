package StringManipulationAndArrays;

public class assig3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nos= {1,2,3,4,5,6,7,8,9,10};
		
		int num=5;
		
		
		
		System.out.println("Position of num1 : nos["+findPos(nos,num)+"]");
		
		
		
	}
	
	public static int findPos(int []nos,int n)
	{
		int pos=-1;
		
		for(int i=0;i<nos.length;i++)
		{
			if(nos[i]==n)
			{
				pos=i;
				break;
			}
		}
		
		return pos;
	}

}
