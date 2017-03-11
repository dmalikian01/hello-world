#include <stdio.h>

int main(void)
{

	int num1;
	int num2;
	int num3;

	printf("Please enter a phone number in the form (999)999-9999\n");
	scanf("(%d)%d %d", &num1, &num2, &num3);

	printf("You entered %d-%d%d\n", num1, num2, num3);

	return 0;
}
