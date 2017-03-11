#include <stdio.h>

int main(void)
{
	int res = 1;
	int i = 1;
	int num;

	printf("Please input a number: ");
	scanf("%d", &num);

	while (i <= num)
	{
		res = res * i;
		i++;
	}

	printf("The factorial of %d is %d\n", num,res);
	return 0;
}
