// Decimal to binary
#include <stdio.h>

int main()
{
    int num;
    int arr[32];
    int count = 0;

    printf("Enter decimal number: ");
    scanf("%d", &num);

    while(num > 0)
    {
        arr[count] = num % 2;
        num = num / 2;
        count++;
    }

    printf("Binary = ");

    for(int i = count - 1; i >= 0; i--)
    {
        printf("%d", arr[i]);
    }

    return 0;
}