
#include<stdio.h>
using namespace std;

int main()
{
  int i=0,j=0,c=0,m,n,k;
  char s1[20], s2[10];
  printf("enter two strings:\n");
  scanf("%s",s1);
  scanf("%s",s2);
  for(m=0;s1[m]!='\0';m++){}
  for(n=0;s2[n]!='\0';n++){}
  
   for(;j<m;j++)
    {
     if(s2[i]==s1[j])
     {
      c++;
      i++;
     }
     else
      i=0;
    if(c==n){                         //complete substring
     printf("pattern found");
     j=10;}                            //break;
    
    }
   printf("j=%d\n", j);
   if(j!=11)
    printf("pattern not found");


}
