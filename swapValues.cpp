#include<stdio.h>
int main()
{

    int x,y;
    printf("Input value of X & Y :\n");
    scanf("%d%d",&x,&y);
    printf("Before Swapping the values of X & Y : %d %d",x,y);

    x=x+y;
    y=x-y;
    x=x-y;
    printf("\nAfter swapping the values of X & Y : %d %d",x,y);
    return 0;

}
