#include <stdio.h>
int main()
{
int a=10,b=9,c=7,result;

result=(a==b)&&(c>b);
printf("(a==b&&(c>b)is %d \n",result);
result=(a==b)&&(c<b);
printf("(a==b)&&(c<b)is %d \n",result);
result=(a==b)||(c>b);
printf("(a==b||(c>b)is %d \n",result);
result=(a!=b)||(c<b);
printf("(a!=b)||(c<b)is %d \n",result);
result=!(a!=b);
printf("!(a!=b) is %d \n",result);
result=!(a==b);
printf("!(a==b) is %d \n",result);
return 0;

}
