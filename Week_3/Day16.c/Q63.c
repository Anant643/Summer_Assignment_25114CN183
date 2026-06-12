//Write a program to Find pair with given sum

#include <stdio.h>

int main()
{
    int n, target;

    printf("Enter size: ");
    scanf("%d", &n);

    int arr[n];

    for(int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }

    printf("Enter target sum: ");
    scanf("%d", &target);

    printf("Pairs are:\n");

    for(int i = 0; i < n - 1; i++)
    {
        for(int j = i + 1; j < n; j++)
        {
            if(arr[i] + arr[j] == target)
            {
                printf("%d + %d = %d\n",
                       arr[i], arr[j], target);
            }
        }
    }

    return 0;
}