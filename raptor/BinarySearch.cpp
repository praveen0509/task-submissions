#include<stdio.h>
using namespace std;
void bsearch(int lb,int ub, int key, int a[]);

int main()
{
  int i,j,key,a[10],n;
  printf("enter n value");
  scanf("%d",&n);
  printf("enter elements\n");
  for(i=0;i<n;i++)
   scanf("%d",&a[i]);
  int temp;
  for(i=0;i<n;i++)
  {  for(j=0;j<n-i-1;j++)
     { 
      if(a[j]>a[j+1])
      {
       temp=a[j];
       a[j]=a[j+1];
       a[j+1]=temp;
      }
     }
  }
  printf("sorted elements are:\n");
  for(i=0;i<n;i++)
   printf("%d\n",a[i]);
  printf("enter key:-");
  scanf("%d",&key);
  bsearch(0,n-1,key,a);
}

void bsearch(int lb,int ub, int key, int a[])
{
  int mid=(lb+ub)/2;
 if(lb<=ub)
 {
  if(key==a[mid])
   printf("search found\n");
  else if(key<a[mid])
   bsearch(lb,mid-1,key,a);
  else
   bsearch(mid+1,ub,key,a);
 }
 else
  printf("search not found\n"); 
}
























