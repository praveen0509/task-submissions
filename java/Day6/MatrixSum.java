package Day6;
import java.util.*;

public class MatrixSum
{
   public static void main(String[] args)
   {
	   
	 short m,n,p,q;
     Scanner ob=new Scanner(System.in);
     System.out.println("enter rows and columns of 1st matrix:");
   
     m=ob.nextShort();
     n=ob.nextShort();
     System.out.println("enter rows and columns of 2nd matrix:");
     p=ob.nextShort();
     q=ob.nextShort();
    if(m==p && n==q)                         //checking rows and columns of two matrices
    {
     short matrix1[][]=new short[m][n];
     System.out.println("Enter values for 1st matrix");
     input(m,n,matrix1);
      
     short matrix2[][]=new short[p][q];
     System.out.println("Enter values for 2nd matrix");
     input(p,q,matrix2);
     
     short matrix3[][]=new short[m][n];
     add(matrix1,matrix2,m,n,matrix3);
     
     System.out.println("1st matrix is:");
     display(matrix1,m,n);
     System.out.println("2nd matrix is:");
     display(matrix2,m,n);
     System.out.println("the additio of two matrices is:");
     display(matrix3,m,n);     
    }
    else
       System.out.println("addition not possible");
    ob.close();
  }
   
   
   public static void add(short matrix1[][],short matrix2[][], short m, short n,short matrix3[][])
   {
	   for(short i=0;i<m;i++)
	      for(short j=0;j<n;j++)
	         matrix3[i][j]=(short)(matrix1[i][j] + matrix2[i][j]);
   }
   
   
   public static void input(short m,short n, short matrix1[][])
   {
	 Scanner obj=new Scanner(System.in);
	  for(short i=0;i<m;i++)
		  for(short j=0;j<n;j++)
			  matrix1[i][j]=obj.nextShort(); 
	  //obj.close();
   }
   
   
   public static void display(short matrix3[][],short m,short n)
   {
	   for(short i=0;i<m;i++)
	   {
		   for(short j=0;j<n;j++)
	        System.out.print(matrix3[i][j]+" ");
	       System.out.println("");
       }
   }
   

}
