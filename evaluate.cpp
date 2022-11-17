#include<stdio.h>
int main()
{
int u,a,t,b,c;
float sqrt;
printf("Enter the value a :");
scanf("%d",&a);
printf("\nEnter the value b:");
scanf("%d",&b);
printf("\nEnter the value c:");
scanf("%d",&c);
printf("\nEnter the value u:");
scanf("%d",&u);
printf("\nEnter the value t:");
scanf("%d",&t);

int V=u+a*t;
int S=u*t+0.5*a;
float T=2*a+sqrt*b+9*c;

printf("The value of V is %d:",V);
printf("The Value of S is %d:",S);
printf("The Value of T is %.3f:",T);

return 0;
}
