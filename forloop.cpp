#include<stdio.h>
int main()
{
   int num,count,sum=0;
   printf("Enter the positive integer: ");
   scanf("%d",&num);

   for(count=0;count<=num;++count){
    sum+=count;
   }
    printf("sum=%d",sum);
    return 0;

}
