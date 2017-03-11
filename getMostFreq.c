#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <ctype.h>
#include <fcntl.h>

int main(int argc, char *argv[])
{

	if (argc != 2)
	{
		printf("Error\n");
		exit(1);
	}

	char t[] = "test.txt";

	if (strcmp(argv[1],t) != 0)
	{
		printf("Error\n");
		exit(1);
	}

	char str[256], ch, result;
	int len = 0, i = 0, count2 = 0, max = -1;
	int count[256] = {0};

	FILE *in_file = fopen("test.txt", "r");

	while (fscanf(in_file, "%c", &ch) != EOF)
	{
		if (ch != ' ')
		{
			ch = tolower(ch);
			str[i] = ch;
			str[i++];
			len++;
		}
	}

	for (i = 0; i < len; i++)
	{
		count[str[i]]++;
	}

	for (i = 0; i < len; i++)
	{
		if (max < count[str[i]])
		{
			max = count[str[i]];
			result = str[i];
		}
	}

	for (int j = 0; j < len; j++)
	{
		if (result == str[j])
		{
			count2++;
		}
	}

	printf("Most frequent letter is %c, it appears %d times.\n", result, count2);

	fclose(in_file);
}
