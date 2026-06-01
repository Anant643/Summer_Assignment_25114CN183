// WAP to calculate factors of a number:-

#include <stdio.h>

int main()
{
    int n;
    int count = 0;

    printf("Enter a number: ");
    scanf("%d", &n);

    printf("The factors of %d are:\n", n);

    for (int i = 1; i <= n; i++)
    {
        if (n % i == 0)
        {
            count++;
            printf("%d\n", i);
        }
    }

    printf("Total factors = %d\n", count);

    return 0;
}