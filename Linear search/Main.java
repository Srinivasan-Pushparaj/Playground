#include<stdio.h>
int main()
{
  int i,j,k,n;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++){
    scanf("%d",&a[i]);
  }
  scanf("%d",&k);
  for(i=0;i<n;i++)
  {
    if(a[i]==k){
      printf("%d",i+1);
      break;
    }
  }
   if(i==n)
      printf("%d isn't present in the array.",k);
  return 0;
}