#include<stdio.h>
int main()
{
    int x,y,z;
    printf("Input the value of X:");
    scanf("%d",&x);
    printf("Input the value of Y:");
    scanf("%d",&y);
    printf("Input the value of Z:");
    scanf("%d",&z);

    x=++x;
    y=x-y;
    z=z+x;

    printf("\n The updated value of the X:%d",x);
    printf("\n The updated value of the Y:%d",y);
    printf("\n The updated value of the Z:%d",z);

    return 0;


}
