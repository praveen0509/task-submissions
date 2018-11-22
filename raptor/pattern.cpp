#include<stdio.h>
using namespace std;

int main()
{
 int i,j,n=11,k,p,l;
 p=n/2;                  //for odd pattern
 for(i=1;i<=n;i++)//increment pattern
 {
 if(i<=n/2+1)
 {
  for(k=1;k<=p;k++)
   printf("  ");
  for(j=1;j<=2*i-1;j++)
    printf("* ");
  printf("\n");
  --p;
  }
 else
  {         
  
  if(i==n/2+2)
  {    
   p=1;   
   k=n-2;
  }                       //decrement pattern
  for(l=1;l<=p;l++)
   printf("  ");
 
  for(j=1;(j<=k) && (k>0);j++)
   printf("* ");
  printf("\n");
  k-=2;
  p++;
  }
 }
}


/*output:
      * 
    * * * 
  * * * * * 
* * * * * * * 
  * * * * * 
    * * * 
      *           */








