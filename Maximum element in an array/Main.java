#include<stdio.h>
int main()
{
  int a,b,i,j,k[20],n;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  	scanf("%d",&k[i]);
  for(i=0;i<n-1;i++)
  {
    for(j=0;j<n-i-1;j++)
    {
      if(k[j]<k[j+1])
      {
        b=k[j];
        k[j]=k[j+1];
        k[j+1]=b;
      }
    }
  }
  printf("%d",k[0]);
  return 0;
}