// Wap to check armstrong number

#include <stdio.h>
#include <math.h>

int main()
{
    int n;

    printf("Enter the number that you want to check: ");
    scanf("%d", &n);

    int temp, original;

    temp = n;
    original =n;

    int count = 0;

    while (temp > 0)
    {
        count++;
        temp = temp / 10;
    }

    int digit;
    double sum = 0;

    while (n > 0)
    {
        digit = n % 10;
        sum = sum + pow(digit, count);
        n = n / 10;
    }

    if (sum == original)
    {
        printf("%d is an Armstrong Number.",original);
    }
    else
    {
        printf("%d is not an Armstrong Number.",original);
    }
    return 0;
}