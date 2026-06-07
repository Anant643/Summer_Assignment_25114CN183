// Write a program to Write function to find sum of two numbers

#include <stdio.h>

int mysum(int a, int b)
{
return a + b;
}

int main()
{
    int a,b;
    printf("Enter two numbers to add: ");
    scanf("%d %d",&a,&b);

    int sum;
    sum = mysum(a,b);

    printf("The sum of two numbers is: %d",sum);
    return 0;
}