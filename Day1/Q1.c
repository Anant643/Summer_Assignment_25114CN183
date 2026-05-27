// Write a program to Calculate sum of first N natural numbers

#include <stdio.h>

int main()
{
    int n;

    printf("Enter the upper limit: ");
    scanf("%d", &n);

    int i, sum = 0;

    for (i = 0; i < n; i++)
    {
        sum = sum + (i + 1);
    }

    printf("The sum of the first %d Natural numbers is: %d ", n, sum);

    return 0;
}