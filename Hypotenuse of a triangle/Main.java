#include<stdio.h>
#include<math.h>
int main()
{
  float a,o,h;
  scanf("%f\n%f",&o,&a);
  h=sqrt((a*a)+(o*o));
  printf("%.2f",h);
  return 0;
}