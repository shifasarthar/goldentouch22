#include<stdio.h>
int main()
{
  int dividend,divisor,quotient,remainder;
  printf("Enter Dividend:");
  scanf("%d",&dividend);
  printf("Enter Divisor;");
  scanf("%d",&divisor);
  quotient=dividend/divisor;
  remainder=dividend%divisor;
  printf("quotient=%d\n",quotient);
  printf("remainder=%d",remainder);
  return 0;
}
