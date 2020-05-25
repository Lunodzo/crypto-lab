//AIM

// Write a C program that contains a string (char pointer) with a value \Hello
// World’. The program should XOR each character in this string with 0 and
// display the result.

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
int main(int argc, char const *argv[])
{
    char str[] = "Idmmn!Vnsme";
    char str1[11];
    int i, len;
    len = strlen(str);
    for (i = 0; i < len; i++)
    {
        str1[i] = str[i] ^ 1;
        printf("%c", str1[i]);
    }
    printf("\n");
    return 0;
}
