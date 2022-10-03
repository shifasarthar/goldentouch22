#include<stdio.h>
int main()
{

    int n,i,range;
    printf("Enter an integer:");
    scanf("%d",&n);
    do
    {

        printf("Enter the range(positive integer):");
        scanf("%d",range);
    }while(range<=0);
    for(i=1;i<=range;++i)
    {

        printf("%D * %d=%d\n",n,i,n*1);
    }
    return 0;0
}
