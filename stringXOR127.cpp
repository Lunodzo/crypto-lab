// Write a C program that contains a string (char pointer) with a
// value \Hello World’. The program should AND or and XOR
// each character in this string with 127 and display the result

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main(int argc, char const *argv[])
{
	char str[] = "Hello World";
	int i, len;
	char str1[11];
	char str2[11];
	char str3[11];
	len = strlen(str);
	for ( i = 0; i < len; i++)
	{
		str1[i] = str[i]&127;
		printf("%c", str1[i]);
	}
	
	for ( i = 0; i < len; i++)
	{
		str2[i] = str[i]^127;
		printf("%c", str2[i]);
	}
	printf("\n");
	return 0;
}
