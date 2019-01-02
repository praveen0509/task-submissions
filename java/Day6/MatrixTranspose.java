package Day6;

import java.util.Scanner;

public class MatrixTranspose
{

	public static void main(String[] args)
	 {
		   
		 short m,n;
	     Scanner ob=new Scanner(System.in);
	     System.out.println("enter rows and columns of matrix:");
	     m=ob.nextShort();
	     n=ob.nextShort();
	     
	     short matrix1[][]=new short[m][n];
	     System.out.println("Enter values for matrix");
	     input(m,n,matrix1);
	     
	     short matrix2[][]=new short[n][m];               //matrix2==transpose matrix
	     
	     System.out.println("The matrix is:");
	     display(matrix1,n,m);                            //displaying first matrix
	     
	     System.out.println("The transpose of matrix is:");
	     transpose(matrix1,matrix2,m,n);
	     display(matrix2,m,n);     
	   	   
	    ob.close();
	 }
	   
	
	   public static void transpose(short matrix1[][],short matrix2[][], short m, short n)
	   {
		   for(short i=0;i<m;i++)
		      for(short j=0;j<n;j++)
		        matrix2[j][i] = matrix1[i][j];
	   }
	   
	   
	   public static void input(short m,short n, short matrix[][])
	   {
		  Scanner obj=new Scanner(System.in);
		  for(short i=0;i<m;i++)
			  for(short j=0;j<n;j++)
				  matrix[i][j]=obj.nextShort(); 
		  obj.close();
	   }
	   
	   
	   
	   public static void display(short matrix2[][],short m,short n)
	   {
		   for(short i=0;i<n;i++)
		   {
			   for(short j=0;j<m;j++)
		        System.out.print(matrix2[i][j]+" ");
		       System.out.println(" ");
	       }
	   }
	   
	   
}
