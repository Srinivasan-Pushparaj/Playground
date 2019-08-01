#include<stdio.h>
#include<math.h>
int main()
{
  int i,j,k,n;
  scanf("%d",&n);
  if(n==1||n==2)
    printf("1");
  else if(n%2==0){
    j=(n/2)-1;
    k=pow(3,j);
    printf("%d",k);
  }
  else if(n%2==1){
    j=n/2;
    k=pow(2,j);
    printf("%d",k);
  }
  return 0;
}