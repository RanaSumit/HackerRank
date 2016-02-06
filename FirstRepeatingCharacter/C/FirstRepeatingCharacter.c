#include<stdio.h>
#include<string.h>
int main()
{
int a[256]={0};
char *b="Helloworldd";
int i;

for(i=0;i<strlen(b);++i)
a[b[i]]++;

for(i=0;i<strlen(b);++i)
if(a[b[i]]>;1)
{
        printf("First Repeating %c\n",b[i]);
        break;
}

}