//Write a program to Add matrices

#include <stdio.h>
#include <stdlib.h>
int main()
{
    int r1, c1, r2, c2;
    printf("Enter the rows and columns of matrix 1:");
    scanf("%d %d", &r1, &c1);

    printf("Enter the rows and columns of matrix 2:");
    scanf("%d %d", &r2, &c2);

    if ((r1 != r2) || (c1 != c2))
    {
        printf("Rows and columns must be of same order.");
        exit(0);
    }
    int A[r1][c1], B[r2][c2], C[r1][c1];
    printf("Enter elements of matrix A:");
    for (int i = 0; i < r1; i++)
    {
        for (int j = 0; j < c1; j++)
        {
            scanf("%d", &A[i][j]);
        }
    }

    printf("Enter elements of matrix B:");
    for (int i = 0; i < r2; i++)
    {
        for (int j = 0; j < c2; j++)
        {
            scanf("%d", &B[i][j]);
        }
    }

    for (int i = 0; i < r1; i++)
    {
        for (int j = 0; j < c1; j++)
        {
            C[i][j] = A[i][j] + B[i][j];
        }
    }
    printf("Resultant matrix= ");

    for (int i = 0; i < r1; i++)
    {
        for (int j = 0; j < c1; j++)
        {
            printf("%d", C[i][j]);
        }
        printf("\n");
    }

    return 0;
}