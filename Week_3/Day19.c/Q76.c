// Write a program to Find diagonal sum.

#include <stdio.h>

int main()
{
    int n;

    printf("Enter order of square matrix: ");
    scanf("%d", &n);

    int arr[n][n];

    printf("Enter matrix elements:\n");

    for(int i = 0; i < n; i++)
    {
        for(int j = 0; j < n; j++)
        {
            scanf("%d", &arr[i][j]);
        }
    }

    int sum = 0;

    for(int i = 0; i < n; i++)
    {
        sum += arr[i][i];
    }

    printf("Diagonal Sum = %d", sum);

    return 0;
}