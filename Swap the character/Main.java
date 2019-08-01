#include<stdio.h>
int main()
{
  char str[10],str1[10],str2[10];
  scanf("%s\n%s\n%s",str,str1,str2);
  int i,j,n,n1,n2;
  for(i=0;str[i]!='\0';i++){
    if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u'||str[i]=='A'||str[i]=='E'||str[i]=='I'||str[i]=='O'||str[i]=='U')
      printf("$");
    else
      printf("%c",str[i]);
  }
  for(i=0;str1[i]!='\0';i++){
    if(str1[i]=='a'||str1[i]=='e'||str1[i]=='i'||str1[i]=='o'||str1[i]=='u'||str1[i]=='A'||str1[i]=='E'||str1[i]=='I'||str1[i]=='O'||str1[i]=='U')
      printf("%c",str1[i]);
    else
      printf("#");
  }
  for(i=0;str2[i]!='\0';i++){
    if(str2[i]>='a'&&str2[i]<='z')
      printf("%c",str2[i]-32);
    else
      printf("%c",str2[i]);
}
  return 0;
}