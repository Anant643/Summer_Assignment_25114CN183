// wap to find the union of two arrays 

#include <stdio.h>

int main()
{
    int n1, n2;
    printf("Enter the size of first array: ");
    scanf("%d", &n1);
    int arr1[n1];

    printf("Enter the elements of first array: ");
    for(int i = 0; i < n1; i++)
    {
        scanf("%d", &arr1[i]);
    }

    printf("Enter the size of second array: ");
    scanf("%d", &n2);
    int arr2[n2];

    printf("Enter the elements of second array: ");
    for(int i = 0; i < n2; i++)
    {
        scanf("%d", &arr2[i]);
    }

    printf("Union of the arrays is:\n");

    for(int i = 0; i < n1; i++)
    {
        printf("%d ", arr1[i]);
    }

    for(int i = 0; i < n2; i++)
    {
        int found = 0;

        for(int j = 0; j < n1; j++)
        {
            if(arr2[i] == arr1[j])
            {
                found = 1;
                break;
            }
        }

        if(found == 0)
        {
            printf("%d ", arr2[i]);
        }
    }

    return 0;
}