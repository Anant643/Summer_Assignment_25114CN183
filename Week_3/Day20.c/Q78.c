// Write a program to Check symmetric matrix

#include<stdio.h>

int main()
{
    int r,c;

    printf("Enter rows and columns: ");
    scanf("%d%d",&r,&c);

    if(r != c)
    {
        printf("Matrix is not symmetric");
        return 0;
    }

    int arr[r][c];

    printf("Enter matrix elements:\n");

    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            scanf("%d",&arr[i][j]);
        }
    }

    int symmetric = 1;

    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            if(arr[i][j] != arr[j][i])
            {
                symmetric = 0;
                break;
            }
        }
    }

    if(symmetric)
        printf("Matrix is symmetric");
    else
        printf("Matrix is not symmetric");

}