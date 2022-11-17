#include<stdio.h>
int main()
{
    int h,w,d,vol;
    printf("\nEnter the Height:");
    scanf("%d",&h);
    printf("\nEnter the Width:");
    scanf("%d",&w);
    printf("\nEnter the Depth:");
    scanf("%d",&d);

    vol=h*w*d;
    printf("The Volume of the cube is:%d",vol);
   return 0;


}
