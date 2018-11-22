#include <iostream>
#include <string>

using namespace std;
int main()
{
   string raptor_prompt_variable_zzyz;
   ?? k;
   ?? sum;
   ?? n;
   ?? r;

   raptor_prompt_variable_zzyz ="enter a number";
   cout << raptor_prompt_variable_zzyz << endl;
   cin >> n;
   sum =0;
   k =n;
   while (!(n==0))
   {
      r =n % 10;
      sum =sum*10+r;
      n =floor(n/10);
   }
   if (k==sum)
   {
      cout << "palindrome" << endl;   }
   else
   {
      cout << "not palinrome" << endl;   }

   return 0;
}
