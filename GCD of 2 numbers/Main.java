#include <stdio.h>
int main()
{
  int i,j,n,m;
  scanf("%d\n%d",&n,&m);
  for(i=1;i<=n&&i<=m;i++)
  {
    if(n%i==0 && m%i==0)
      j=i;
  }
    printf("%d",j);
  return 0;
}