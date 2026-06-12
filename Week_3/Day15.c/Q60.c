//Write a program to Move zeroes to end.

#include <stdio.h>

int main()
{
    int n;

    printf("Enter size of array: ");
    scanf("%d", &n);

    int arr[n];

    printf("Enter elements:\n");
    for(int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }

    int index = 0;

    for(int i = 0; i < n; i++)
    {
        if(arr[i] != 0)
        {
            arr[index] = arr[i];
            index++;
        }
    }

    while(index < n)
    {
        arr[index] = 0;
        index++;
    }

    printf("Array after moving zeroes:\n");

    for(int i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }

    return 0;
}