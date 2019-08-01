#include <stdio.h>
int main()
{   
    int binary, octal=0,j=1, remainder;
    scanf("%d",&binary);
    while(binary!=0)
    {
        remainder = binary % 10;
        octal = octal + remainder * j;
        j = j * 2;
        binary = binary / 10;
    }
    printf("%lo\n", octal);
    return 0;
}