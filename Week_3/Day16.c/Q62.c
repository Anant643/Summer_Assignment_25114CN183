//Write a program to Find maximum frequency element.

#include <stdio.h>

int main()
{
    int n;

    printf("Enter size: ");
    scanf("%d", &n);

    int arr[n];

    for(int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }

    int maxFreq = 0;
    int element;

    for(int i = 0; i < n; i++)
    {
        int count = 1;

        for(int j = i + 1; j < n; j++)
        {
            if(arr[i] == arr[j])
            {
                count++;
            }
        }

        if(count > maxFreq)
        {
            maxFreq = count;
            element = arr[i];
        }
    }

    printf("Element = %d\n", element);
    printf("Frequency = %d", maxFreq);

    return 0;
}
