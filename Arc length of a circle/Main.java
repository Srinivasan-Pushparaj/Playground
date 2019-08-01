#include<stdio.h>
int main()
{
  float r,t,l;
  scanf("%f\n%f",&r,&t);
  l=(t/360)*2*3.14*r;
  printf("%.2f",l);
  return 0;
}