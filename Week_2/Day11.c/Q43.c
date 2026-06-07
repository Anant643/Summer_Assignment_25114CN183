//Write a program to Write function to check prime.

#include <stdio.h>

int Prime(int n)
{
    int divisor = 0;

    if (n <= 1)
        return 0;

    for (int i = 2; i < n; i++)
    {
        if (n % i == 0)
        {
            divisor = 1;
            break;
        }
    }

    if (divisor == 1)
        return 0;
    else
        return 1;
}

int main()
{
    int n;

    printf("Enter a number: ");
    scanf("%d", &n);

    if (Prime(n))
        printf("Prime.");
    else
        printf("Not Prime.");

    return 0;
}