#include<stdio.h>
int main()
{
  int a,b,c;
  scanf("%d\n%d\n%d\n",&a,&b,&c);
  if(a<b && a<c)
  {
    if(b<c)
      printf("%d",b);
    else
      printf("%d",c);
  }
  else if(a>b && a>c)
  {
    if(b>c)
      printf("%d",b);
    else
      printf("%d",c);
  }
  else 
    printf("%d",a);
  return 0;
}