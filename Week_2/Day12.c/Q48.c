//Write a program to Write function for perfect number.

#include <stdio.h>

int isPerfect(int n)
{
    int i, sum = 0;

    for (i = 1; i < n; i++)
    {
        if (n % i == 0)
            sum += i;
    }

    return (sum == n);
}

int main()
{
    int num;

    printf("Enter a number: ");
    scanf("%d", &num);

    if (isPerfect(num))
        printf("Perfect Number");
    else
        printf("Not a Perfect Number");

    return 0;
}