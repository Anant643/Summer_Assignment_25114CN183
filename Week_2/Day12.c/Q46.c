// Write a program to Write function for Armstrong.

#include <stdio.h>
#include <math.h>

int Armstrong(int n)
{
    int temp = n, digits = 0;
    int rem;
    int sum = 0;

    while (temp != 0)
    {
        digits++;
        temp /= 10;
    }

    temp = n;

    while (temp != 0)
    {
        rem = temp % 10;
        sum += pow(rem, digits);
        temp /= 10;
    }

    return (sum == n);
}

int main()
{
    int num;

    printf("Enter a number: ");
    scanf("%d", &num);

    if (Armstrong(num))
        printf("Armstrong Number");
    else
        printf("Not an Armstrong Number");

    return 0;
}