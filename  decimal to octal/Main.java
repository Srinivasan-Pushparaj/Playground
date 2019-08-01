#include<stdio.h>
int main()
{
  int i,j,n,a[10];
  scanf("%d",&n);
  j=0;
  while(n>0)
  {
    a[j]=n%8;
    n/=8;
    j++;
  }
  for(i=j-1;i>=0;i--)
    printf("%d",a[i]);
  return 0;
}