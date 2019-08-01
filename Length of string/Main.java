#include<stdio.h>
int main()
{
  char ch[20];
  int i=0;
  static int n=0;
  scanf("%[^\n]s",&ch);
  while(1)
  {
    if(ch[i]!='\0')
      n++;
    else
      break;
  i++;
  }
  printf("%d",n);
  return 0;
}