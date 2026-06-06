/*
Write a program to Print character pyramid.
    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA

*/

#include <stdio.h>

int main()
{
    int n = 5;
    int i,j,k,s;

    
    for (i = 1; i <= n; i++)
    {

        for (s = 1; s <= n - i; s++)
            printf(" ");

        for (k = 0; k < i; k++)
            printf("%c", 'A' + k);

        for (j = i - 2; j >= 0; j--)
            printf("%c", 'A' + j);

        printf("\n");
    }

    return 0;
}