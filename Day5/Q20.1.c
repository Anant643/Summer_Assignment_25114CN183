//Write a program to Find largest prime factor
//Brute force approach

#include <stdio.h>

int main()
{
    int n;

    printf("Enter a number: ");
    scanf("%d", &n);

    // Store factors
    int factors[100];
    int factor_count = 0;

    for (int i = 1; i <= n; i++)
    {
        if (n % i == 0)
        {
            factors[factor_count] = i;
            factor_count++;
        }
    }

    // Store prime factors
    int prime_factors[100];
    int prime_count = 0;

    for (int i = 0; i < factor_count; i++)
    {
        int divisor = 0;

        if (factors[i] <= 1)
        {
            continue;
        }

        for (int j = 2; j < factors[i]; j++)
        {
            if (factors[i] % j == 0)
            {
                divisor = 1;
                break;
            }
        }

        if (divisor == 0)
        {
            prime_factors[prime_count] = factors[i];
            prime_count++;
        }
    }

    // Find largest prime factor
    int largest = prime_factors[0];

    for (int i = 1; i < prime_count; i++)
    {
        if (prime_factors[i] > largest)
        {
            largest = prime_factors[i];
        }
    }

    printf("Largest Prime Factor = %d", largest);

    return 0;
}
