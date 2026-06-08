//Write a program to Write function for palindrome.

#include <stdio.h>

int Palindrome(int n)
{
    int rev = 0, temp = n, rem;

    while (temp != 0)
    {
        rem = temp % 10;
        rev = rev * 10 + rem;
        temp /= 10;
    }

    return (rev == n);
}

int main()
{
    int num;

    printf("Enter a number: ");
    scanf("%d", &num);

    if (Palindrome(num))
        printf("Palindrome Number");
    else
        printf("Not a Palindrome Number");

    return 0;
}