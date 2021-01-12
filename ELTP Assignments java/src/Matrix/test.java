package Matrix;

import java.util.Scanner;

class matrixUtility
{
	
	void addMatrix(int[][] mat1, int[][] mat2)
	{
		int len=mat1.length;
		int [][]res=new int[len][len];
		
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				
				res[i][j]=mat1[i][j]+mat2[i][j];
				
			}
		}
		
		System.out.println("Addition Matrix : ");
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				
				System.out.print(res[i][j]+" ");
				
			}
			System.out.println();
		}
	}
	
	void transpose(int[][] mat)
	{
		int l=mat.length;
		int transpose[][]=new int[l][l];   
	    
		 
		for(int i=0;i<l;i++){    
			for(int j=0;j<l;j++){    
				transpose[i][j]=mat[j][i];  
			}    
		} 
		
		System.out.println("Transpose Matrix : ");
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < l; j++) {
				
				System.out.print(transpose[i][j]+" ");
				
			}
			System.out.println();
		}
	}
	
	void multiply(int[][] mat1, int [][] mat2)
	{
		int l=mat1.length;
		int c[][]=new int[l][l]; 
	    
		 System.out.println("Multiplication Matrix : ");
		for(int i=0;i<l;i++){    
			for(int j=0;j<l;j++){    
				c[i][j]=0;      
				for(int k=0;k<l;k++)      
				{      
					c[i][j]+=mat1[i][k]*mat2[k][j];      
				}  
				System.out.print(c[i][j]+" ");   
			}  
			System.out.println();   
		}    
	}
}


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		//--------------taking two matrix from user-----------------
		
	    
	    int choice;
	    System.out.println("Welcome to matrix utility application....");
	    do
	    {
	    	System.out.println("=====================================================");
	    	System.out.println("Enter your choice\n1. Add Matrix\n2. Transpose Matrix\n3. Multiplication Matrix\n0. Exit");
	    	choice=sc.nextInt();
	    	matrixUtility m=new matrixUtility();
	    	switch(choice)
	    	{
	    		case 1:
	    			System.out.println("Enter size of matrices  n*n enter value of n");
	    		    int n=sc.nextInt();
		    		int[][] mat1=new int[n][n];
				    System.out.println("Enter matrix 1");
				    
				    for (int i=0;i<n ;i++ )
				    {
				        for (int j=0; j<mat1[i].length; j++)
				        {
				            mat1[i][j]=sc.nextInt();
				        }
				    }
				    
				    
				    int[][] mat2=new int[n][n];
				    System.out.println("Enter matrix 2");
				    
				    for (int i=0;i<mat2.length ;i++ )
				    {
				        for (int j=0; j<mat2[i].length; j++)
				        {
				            mat2[i][j]=sc.nextInt();
				        }
				    }
				    
				    m.addMatrix(mat1, mat2);
				    
				 break;
				 
	    		case 2:
	    			System.out.println("Enter size of matrices  n*n enter value of n");
	    		    int n1=sc.nextInt();
	    			int[][] mat=new int[n1][n1];
				    System.out.println("Enter matrix ");
				    
				    for (int i=0;i<n1 ;i++ )
				    {
				        for (int j=0; j<mat[i].length; j++)
				        {
				            mat[i][j]=sc.nextInt();
				        }
				    }
				    
				    m.transpose(mat);
				break;
	    		case 3 :
					System.out.println("Enter size of matrices  n*n enter value of n");
	    		    int n2=sc.nextInt();
		    		int[][] mat11=new int[n2][n2];
				    System.out.println("Enter matrix 1");
				    
				    for (int i=0;i<n2 ;i++ )
				    {
				        for (int j=0; j<mat11[i].length; j++)
				        {
				            mat11[i][j]=sc.nextInt();
				        }
				    }
				    
				    
				    int[][] mat22=new int[n2][n2];
				    System.out.println("Enter matrix 2");
				    
				    for (int i=0;i<mat22.length ;i++ )
				    {
				        for (int j=0; j<mat22[i].length; j++)
				        {
				            mat22[i][j]=sc.nextInt();
				        }
				    }
				    
				    
				   
		    		m.multiply(mat11, mat22);	
		    			
	    			
	    		break;
	    		
	    		default:
	    			System.out.println("\n Please enter valid choice .....\n");
	    	}
		    
	    }while(choice!=0);
	    
	    System.out.println("---------------------------------");
	    System.out.println("Thank you for using my application.....");
	    
	    sc.close();

	}

}
