#include<stdio.h>
int main()
{
   int number;
   printf("Enter the number :");
   scanf("%d",&number);

   if(number%2==0){

      printf("%d is an even integer .",number);
      }
   else
   {

       printf("%d is an odd integer .",number);
   }
    return 0;

}
