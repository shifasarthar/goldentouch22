#include<stdio.h>
#include<conio.h>

int main()
{

  int a,b,c,large;
  printf("Enter first number: ");
  scanf("%d",&a);
  printf("Enter second number: ");
  scanf("%d",&b);
  printf("Enter third number: ");
  scanf("%d",&c);

  large=(a>b&&a>c)?(a):((b>c)?(b):(c));
  printf("Largest number is:%d\n",large);
  return 0;

}
