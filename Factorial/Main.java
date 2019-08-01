#include<stdio.h>
int main()
{
	long int n,i,f=1;
  scanf("%ld",&n);
  for(i=1;i<=n;i++)
  {
    f=f*i;
  }
    printf("%ld",f);
  return 0;
}