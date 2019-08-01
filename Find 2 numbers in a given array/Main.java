#include<stdio.h>
int main()
{
  	//type your code here
  int n,i,num1,num2,num1_idx=-1,num2_idx=-1;;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d %d",&num1,&num2);
   for(i=0;i<n;i++)
  {
    if(num1==a[i] && num1_idx==-1)
      num1_idx=i;
    if(num2==a[i] && num2_idx==-1)
      num2_idx=i;
  }
  printf("Element 1 index = %d\nElement 2 index = %d",num1_idx,num2_idx);
  return 0;
}


  
  
  
  