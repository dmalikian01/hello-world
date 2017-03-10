// Derek Malikian
// CSCI 1301-201
// Due 01/27/14
// Submission 02/04/2014

/**This program will allow a user to enter any number and it will compute the
   square, cube, and fourth power*/

import java.util.Scanner;  //Import the scanner class to allow keyboard input from the user.

public class Assignment1               //Declare the class.
{ 
   public static void main(String[] args)    //Declare the method.
   {
   
   Scanner in = new Scanner(System.in);   //Creating the scanner object
   
      System.out.println("Please enter a number: ");  //This will ask the user to enter a number.
      
         double x = in.nextDouble();   /**Declaring the variable to hold the input value, 
                                       this will allow the use of decimal numbers.*/
      
         double square = (x * x);      //This will multiply the number by itself
      
         double cube = (x * x * x);    //This will cube the number entered 
      
         double fourth = Math.pow(x, 4);  //This will multiply the number to the fourth power, used the Math.pow command.
         
         
      System.out.println(square);   //Prints value squared
      System.out.println(cube);     //Prints value cubed 
      System.out.println(fourth);   //Prints value to the fourth power
      }}
      
     