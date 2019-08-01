#include<stdio.h>
int main()
{
  int i,j,n;
  scanf("%d",&n);
  if(n%2==1)
  {
    n/=2;
    i=n*2;
    printf("%d",i);
  }
  else
  {
    n/=2;
    i=n*1-1;
    printf("%d",i);
  }
  return 0;
}