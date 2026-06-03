//Calculate power w/o pow()

#include <stdio.h>

int main()
{
    int x, n;
    long long result = 1;

    printf("Enter the nnumber and it's pwer and n: ");
    scanf("%d %d", &x, &n);

    for(int i = 1; i <= n; i++)
    {
        result = result * x;
    }

    printf("%d^%d = %lld", x, n, result);

    return 0;
}