// Write a program to Transpose matrix

#include <stdio.h>

int main()
{
    int r, c;

    printf("Enter rows and columns: ");
    scanf("%d%d", &r, &c);

    int A[r][c], T[c][r];

    printf("Enter matrix elements:\n");

    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c; j++)
        {
            scanf("%d", &A[i][j]);
        }
    }

    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c; j++)
        {
            T[j][i] = A[i][j];
        }
    }

    printf("Transpose matrix:\n");

    for (int i = 0; i < c; i++)
    {
        for (int j = 0; j < r; j++)
        {
            printf("%d ", T[i][j]);
        }
        printf("\n");
    }


 return 0;
}