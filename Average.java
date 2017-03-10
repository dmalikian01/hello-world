import java.util.Scanner;

public class Average
{
   public static void main(String[] args)
   {

Scanner in = new Scanner(System.in);

System.out.print("Please enter three values:  ");
int x = in.nextInt();
int y = in.nextInt();
int z = in.nextInt();

double average = (x+y+z)/ 3.0;

System.out.println(average);
}}