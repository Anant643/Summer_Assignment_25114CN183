//Write a program to Check whether a number is palindrome.

#include <stdio.h>
int main()
{
    int n;
    printf("Enter a number:");
    scanf("%d", &n);
    int original = n;

    int reverse = 0, digit;

    while (n > 0)
    {
        digit = n % 10;
        reverse = reverse * 10 + digit;
        n = n / 10;
    }
    if(reverse == original)
    {
        printf("%d is a Palindrome number.",original);
    }
    else
    {
        printf("%d is not a Palindrome number.",original);
    }
    return 0;
}
