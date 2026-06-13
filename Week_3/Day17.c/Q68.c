// wap to find common elements between two arrays
//um i actually dont know the difference between intersection and common elt

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


    printf("Common Elements:\n");

    for(int i = 0; i < n1; i++)
    {
        for(int j = 0; j < n2; j++)
        {
            if(arr1[i] == arr2[j])
            {
                printf("%d ", arr1[i]);
                break;
            }
        }
    }

    return 0;
}