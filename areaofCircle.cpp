#include<stdio.h>
int main()
{
    int rad;
    float PI=3.14,area,cf;

    printf("Enter radius of circle:");
    scanf("%d",&rad);

    area=PI*rad*rad;
    printf("\nArea of circle:%f",area);

    cf=2*PI*rad;
    printf("\nCircumference of circle:%f",cf);

    return 0;
}
