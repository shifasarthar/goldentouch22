#include<stdio.h>
int main()
{
    int n1;
    int n2;

    printf("Enter the first value\n");
    scanf("%d",&n1);
    printf("Enter the second value\n");
    scanf("%d",&n2);
    int sum=n1+n2;
    printf("The Addition of n1 and n2 is %d \n",sum);
    int sub=n1-n2;
    printf("The Subraction of n1 and n2 is %d \n",sub);
    int mul=n1*n2;
    printf("The Multiplication of n1 and n2 is %d \n",mul);
    int div=n1/n1;
    printf("The Division of n1 and n2 is %d \n",div);
    int mod=n1%n2;
    printf("The Remainder of n1 and n2 is %d \n",mod);
    return 0;

}
