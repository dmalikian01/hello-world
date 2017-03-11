#include <stdio.h>

int main(void)
{
	char str[100], ch, *p;

	p = str;

	int i, len;

	printf("Enter a message: ");
	while ((ch = getchar()) != '\n')
	{
		*p++ = ch;
		len++;
	}

	printf("Reversal is: ");
	for (p = &str[len] - 1; p >= &str[0]; p--)
	{
		printf("%c", *p);
	}

	printf("\n");

	return 0;
}
