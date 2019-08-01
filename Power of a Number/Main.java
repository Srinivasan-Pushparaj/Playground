#include <stdio.h>
#include<math.h>
int main()
{
  	int b,p,t;  
    scanf("%d\n%d",&b,&p);
  if(p>=0)
  {
    t=pow(b,p);
    printf("%d",t);
  }
  else
    printf("Wrong input");
  
    return 0;
}