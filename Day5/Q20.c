//Write a program to Find largest prime factor

#include <stdio.h>

int main()
{
    int n;

    printf("Enter a number: ");
    scanf("%d", &n);

    int largest = 0;

    for (int i = 1; i <= n; i++)
    {
        if (n % i == 0)
        {
            int divisor = 0;

            if (i > 1)
            {
                for (int j = 2; j < i; j++)
                {
                    if (i % j == 0)
                    {
                        divisor = 1;
                        break;
                    }
                }

                if (divisor == 0)
                {
                    largest = i;
                }
            }
        }
    }

    printf("Largest Prime Factor = %d", largest);

    return 0;
}