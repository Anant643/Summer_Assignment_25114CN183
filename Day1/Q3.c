// Write a program to Find factorial of a number◔◔
#include <stdio.h>

int main()
{
    int n;
    long long fact = 1;
    printf("Enter a number: ");
    scanf("%d", &n);

    if (n < 0)
    {
        printf("Factorial is not defined for negative numbers.");
    }
    else
    {
        for (int i = 1; i <= n; i++)
        {
            fact = fact * i;
        }
        printf("factorial = %lld", fact);
    }

    return 0;
}