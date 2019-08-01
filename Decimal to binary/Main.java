#include<stdio.h>
int main()
{
  int a,n,i,j[10];
  scanf("%d",&n);
  i=0;
  while(n>0)
  {
    j[i]=n%2;
    n=n/2;
    i++;
  }
  for(a=i-1;a>=0;a--)
    printf("%d",j[a]);
  return 0;
}