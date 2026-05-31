// Wap to print Armstrong numbers in a range

#include <stdio.h>
#include <math.h>

int main()
{
    int start, end;

    printf("Enter the starting and ending number: ");
    scanf("%d %d", &start, &end);

    for (int n = start; n <= end; n++)
    {
        int temp, original;

        temp = n;
        original = n;

        int count = 0;

        while (temp > 0)
        {
            count++;
            temp = temp / 10;
        }

        temp = n;

        double sum = 0;
        int digit;

        while (temp > 0)
        {
            digit = temp % 10;
            sum = sum + pow(digit, count);
            temp = temp / 10;
        }

        if (sum == original)
        {
            printf("%d ", original);
        }
    }

    return 0;
}