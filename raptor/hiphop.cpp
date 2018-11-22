#include<stdio.h>
using namespace std;

int main()
{
  int i;
  for(i=1;i<50;i++)
  {
   if(i%15==0)
    printf("%d=hiphop\n",i);
   else if(i%5==0)
    printf("%d=hop\n",i);
   else if(i%3==0)
    printf("%d=hip\n",i);
  }
}
