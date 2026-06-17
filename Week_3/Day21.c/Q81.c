//Find String Length Without strlen()


#include <stdio.h>

int main() {
    char str[100];
    int length = 0;

    printf("Enter a string: ");
    fgets(str, sizeof(str), stdin);

    while (str[length] != '\0') {
        length++;
    }

    if (str[length - 1] == '\n')
        length--;

    printf("Length of string = %d\n", length);

    return 0;
}