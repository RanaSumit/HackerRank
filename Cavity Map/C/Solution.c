#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

   int i,j,n;
    scanf("%d",&n);
     char arr[n][n];
    for(i=0;i<n;i++)
        scanf("%s",arr[i]);
    for(i=1;i<n-1;i++)
        {
              for(j=1;j<n-1;j++)
            {
  if(arr[i-1][j]<arr[i][j]&&arr[i+1][j]<arr[i][j]&&arr[i][j-1]<arr[i][j]&&arr[i][j+1]<arr[i][j])
           arr[i][j]='X';
        }
    }
     for(i=0;i<n;i++)
        {

        for(j=0;j<n;j++)
            {
            printf("%c",arr[i][j]);
                  
        }
         printf("\n");
    }
  
    return 0;
}