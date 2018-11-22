#include<stdio.h>
using namespace std;

int main()
{
 char s1[20]="praveen";
 char s2[20]="aveenpr";
 int i,j,l,m,k=0;
 for(l=0;s1[l]!='\0';l++){}
 l=l+1;
 for(m=0;s2[m]!='\0';m++){}
 m=m+1;
  
 if(l==m)
 {
  for(i=0;s1[i]!='\0';i++)
  {
  k=0;
  for(j=0;s2[j]!='\0';j++)
  {
   if(s1[i]==s2[j])
   {
    s1[i]='#';
    s2[j]='#';
    k=1;  
   }
  }
  if(k==0){
   printf("not anagram");
   break;}
  }
 if(k==1)
  printf("anagram"); 
 }
 else
   printf("not anagram");
}
