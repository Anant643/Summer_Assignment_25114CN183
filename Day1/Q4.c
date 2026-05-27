// Write a program to Count digits in a number.

#include <stdio.h>

int main()
{
    int n, original, count = 0;

    printf("Enter a number: ");
    scanf("%d", &n);

    original = n;

    if (n == 0)
    {
        count = 1;
    }
    else
    {
        while (n != 0)
        {
            n = n / 10;
            count++;
        }
    }

    printf("The number of digits in %d is %d.", original, count);

    return 0;
}