// Write a program to Print prime numbers in a range.

#include <stdio.h>

int main()
{
    int start, end;

    printf("Enter start and end: ");
    scanf("%d %d", &start, &end);

    for (int n = start; n <= end; n++)
    {
        int divisor = 0;

        if (n <= 1)
        {
            printf("%d is not prime.\n", n);
            continue;
        }

        for (int i = 2; i < n; i++)
        {
            if (n % i == 0)
            {
                divisor = 1;
                break;
            }
        }

        if (divisor == 0)
            printf("%d is prime.\n", n);
    }

    return 0;
}