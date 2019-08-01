#include<stdio.h>
#include<string.h>
int main()
{
  char ch[20];
  int i,n,j=0,k=0;
  gets(ch);
  n=strlen(ch);
  for(i=0;i<n;i++)
  {
    if(ch[i]!=' '||ch[i]=='\0')
      continue;
    else
      k++;
  }
  printf("%d",k+1);
  return 0;
}