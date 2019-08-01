#include<stdio.h>
int main()
{
  int n,m,i,j=1,lcm;
  scanf("%d %d",&n,&m);
  for(i=1;i<=n&&i<=m;i++)
  {
    if(n%i==0 && m%i==0)
      j=i;
  }
  lcm=(n*m)/j;
  printf("%d",lcm);
  return 0;
}