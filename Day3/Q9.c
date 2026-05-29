// Write a program to Check whether a number is prime.

#include <stdio.h>
int main()
{
    int n, divisor = 0;
    printf("Enter a number: ");
    scanf("%d", &n);

    if (n <= 1)
    {
        printf("Invalid.");
    }
    else
    {
        for (int i = 2; i < n; i++)
        {
            if (n % i == 0)
            {
                divisor = 1;
                break;
            }
        }

        if (divisor == 1)
            printf("Not Prime.");
        else
            printf("Prime.");
    }
    return 0;
}