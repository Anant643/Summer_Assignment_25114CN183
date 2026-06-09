//Write a program to Find sum and average of array

#include <stdio.h>

int main()
{
    int n;
    int sum = 0;

    printf("Enter size of array: ");
    scanf("%d", &n);

    int arr[n];

    printf("Enter %d elements:\n", n);

    for(int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
        sum += arr[i];
    }

    float average = (float)sum / n;

    printf("Sum = %d\n", sum);
    printf("Average = %.2f\n", average);

    return 0;
}