#include<stdio.h>
int main()
{
  int i,j=0,n,k=1,a;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    printf("%d ",j);
    a=j+k;
    j=k;
    k=a;
  }
  return 0;
}