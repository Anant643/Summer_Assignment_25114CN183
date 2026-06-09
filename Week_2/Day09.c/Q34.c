/*
Write a program to Print reverse number
triangle.
12345
1234
123
12
1
*/

#include <stdio.h>
int main()
{
    int i, j;
    int n = 6;

    for (i = 1; i <= n; i++)
    {
        for (j = 1; j <= n - i; j++)
        {
            printf("%d",j);
        }
        printf("\n");
    }

    return 0;
}