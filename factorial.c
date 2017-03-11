#include <stdio.h>

int  main(void)
{

	int num = 5;
	int res = 1;
	int i = 1;

	while (i <= num)
	{
		res = res * i;
		i++;
	}

	printf("The factorial of %d is %d\n", num,res);
	return 0;
}
