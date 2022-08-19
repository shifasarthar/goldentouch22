#include<stdio.h>
int main()
{
int a=3;
int c;

c=a;
printf("c= %d \n", c);
c+=a;
printf("c= %d \n",c);
c-=a;
printf("c= %d \n",c);
c*=a;
printf("c=%d \n",c);
c/=a;
printf("c=%d \n",c);
c%=a;
printf("c=%d \n",c);
return 0;
}
