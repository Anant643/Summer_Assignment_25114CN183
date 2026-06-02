// Binary to Decimal

#include <stdio.h>

int main()
{
    int binary;
    int decimal = 0;
    int power = 1;
    int remainder;

    printf("Enter binary number: ");
    scanf("%d", &binary);

    while(binary > 0)
    {
        remainder = binary % 10;
        decimal = decimal + (remainder * power);

        power = power * 2;
        binary = binary / 10;
    }

    printf("Decimal = %d", decimal);

    return 0;
}