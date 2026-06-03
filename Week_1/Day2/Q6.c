// WAP to find the reverse of a number

#include <stdio.h>
int main()
{
    int n;
    printf("Enter a number:");
    scanf("%d", &n);

    int reverse = 0, digit;

    while (n > 0)
    {
        digit = n % 10;
        reverse = reverse * 10 + digit;
        n = n / 10;
    }
    printf("Reverse of the number = %d", reverse);
    return 0;
}