#include<stdio.h>
#include<math.h>
int main()
{
  int i,a=0,j,k,n;
  scanf("%d",&n);
  i=0;
  while(n>0)
  {
    j=n%10;
    if(j==1)
    {
    k=pow(2,i);
    a=a+k;
    }
    n/=10;
    i++;
  }
  printf("%d",a);
  return 0;
}