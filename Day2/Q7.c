//Write a program to Find product of digits
#include <stdio.h>

int main()
{
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);

    int digit;
    int product = 1;

    while (n != 0)
    {
        digit = n % 10;
        product = product * digit;
        n = n / 10;
    }
    printf("Product of digits = %d", product);
    return 0;
}