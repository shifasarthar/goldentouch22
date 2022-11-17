#include <stdio.h>
int main()
{
    int first,second,add,subtract,multiply;
    float divide;

    printf("Enter two integers:\n");
    scanf("%d%d",&first,&second);

    add=first+second;
    subtract=first-second;
    multiply=first*second;
    divide=first/(float)second;

    printf("Sum=%d\n",add);
    printf("Subtract=%d\n",subtract);
    printf("Multiply=%d\n",multiply);
    printf("Division=%f\n",divide);
    return 0;

}
