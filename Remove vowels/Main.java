#include<stdio.h>
int main()
{
  char str[100];
  scanf("%[^\n]s", str);
  for(int i=0;str[i]!='\0';i++){
    if(str[i]=='a'||str[i]=='A'||str[i]=='e'||str[i]=='E'||str[i]=='i'||str[i]=='I'||str[i]=='o'||str[i]=='O'||str[i]=='u'||str[i]=='U')
      continue;
    else
      printf("%c",str[i]);
  }
  return 0;
}