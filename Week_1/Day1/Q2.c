// Write a program to Print multiplication table of a given number
#include <stdio.h>
int main()
{
    int n;
    printf("Enter the number: ");
    scanf("%d", &n);

    int i;
    int result = 0;

    printf("Multiplication Table of %d is: \n", n);
    for (i = 1; i <= 10; i++)
    {
        result = n * i;
        printf("%d * %d  = %d\n", n, i, result);
    }

    return 0;
}