#include<stdio.h>
int main()
{
  int num,a,b,sum;
    scanf("%d",&num);
  a=num/100;
  b=(num/100)%10;
  sum=a+b-1;
  printf("%d",sum);
  return 0;
}