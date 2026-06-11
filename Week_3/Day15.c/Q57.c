//wap to reverse an array

#include <stdio.h>
int main()
{
    int n;
    printf("Enter the number of elements in the array:");
    scanf("%d", &n);

    int arr[n];
    printf("Enter %d elements: ", n);
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }

    for (int i = 0; i < n / 2; i++)
    {
        int temp = arr[i];
        arr[i] = arr[n - 1 - i];
        arr[n - 1 - i] = temp;
    }
    printf("Reversed array =\n");
    for (int i = 0; i < n; i++)
    {
        printf("%d  ", arr[i]);
    }
    return 0;
}