// Wap to find nth fibonacci term

#include <stdio.h>

int main()
{
    int n, a = 0, b = 1, next;

    printf("Enter the term to find: ");
    scanf("%d", &n);

    if (n <= 0)
        printf("Invalid term.");
    else if (n == 1)
        printf("Fibonacci term = 0");
    else if (n == 2)
        printf("Fibonacci term = 1");
    else
    {
        for (int i = 3; i <= n; i++)
        {
            next = a + b;
            a = b;
            b = next;
        }

        printf("Fibonacci term = %d", b);
    }

    return 0;
}