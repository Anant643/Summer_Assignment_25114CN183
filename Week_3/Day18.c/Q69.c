//Wap to implement bubble sort


#include <stdio.h>

int main()
{
    //input logic
    int n;
    printf("Enter the number of elements in the array: ");
    scanf("%d",&n);

    int arr[n];
    int i;
    printf("Enter the elements in the array: ");
    for(i = 0; i < n; i++)
    {
        scanf("%d",&arr[i]);
    }

    //Bubble sort logic
    for(int i = 0; i < n - 1; i++)       // passes
    {
        for(int j = 0; j < n - 1 - i; j++)   // comparisons
        {
            if(arr[j] > arr[j + 1])
            {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }

    printf("Sorted array:\n");
    for(int i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }

    return 0;
}