#include<stdio.h>
#include<string.h>
int main()
{
  char ch[20];
  gets(ch);
  int k=0,i,j,n;
  n=strlen(ch);
  j=ch[0];
  if(n>20){
      printf("Invalid Input");
  }
  else{
  for(i=0;i<n;i++){
    if(j==ch[i])
      k++;
    else if(j!=ch[i]){
      printf("%c%d",ch[i-1],k);
      j=ch[i];
      k=1;
    }
  }
   printf("%c%d",ch[i-1],k);
}
  return 0;
}