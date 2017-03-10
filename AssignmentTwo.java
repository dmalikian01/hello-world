//Derek Malikian
//Assignment #2
//CSCI 1301
//Feb 9, 2014
//Submission date Feb 18, 2014

/** This program will calculate the users tax rate based on income and if the user is single or married*/


import java.util.*;                         //Import the Scanner class to allow keyboard input from the user.

public class AssignmentTwo                        //Declare the class.
{
   public enum maritalStatus {s,m}                //Using the Enumerated type so the values for maritalStatus can only be s and m.
   
   public static void main(String[] args)         //Declare the method.
   {
       
      final double RATE1 = 0.10;                  //The tax rate for 10%.
      final double RATE2 = 0.15;                  //The tax rate for 15%.
      final double RATE3 = 0.25;                  //The tax rate for 25%.
      
      final double RATE1_SINGLE_LIMIT = 8000;     //First single taxable income.
      final double RATE2_SINGLE_LIMIT = 32000;    //Second single taxable income.
      
      final double RATE1_MARRIED_LIMIT = 16000;   //First married taxable income.
      final double RATE2_MARRIED_LIMIT = 64000;   //Second married taxable income.     
      
      double tax1 = 0;                             //First tax rate.
      double tax2 = 0;                             //Second tax rate.
      
      
      
      Scanner in = new Scanner(System.in);               //Creating the Scanner object.
      System.out.print("Please enter your income: ");    //Prompt user to enter their income.
      double income =  in.nextDouble();                //Declaring the variable income.
      
     
      
      if (income < 0)
      {
         System.out.println("Please enter positive value.");
         return;
      }
        
           
      System.out.print("Pleae enter s for single, m for married: ");    //Prompt user to enter either single or married.
      String maritalStatus = in.next();                                 //Allows the input of s or m.
      
      if (maritalStatus.equals("s"))                      //First if statement, if true then program will continue to next step below.
      {
         if (income <= RATE1_SINGLE_LIMIT)                //If users income is less than $8000 then statement is true.
         {
            tax1 = RATE1 * income;                        //The first tax rate ten percent will be multiplied by income.
         }
         if (income >= RATE1_SINGLE_LIMIT && income <= RATE2_SINGLE_LIMIT)    //If the income is greater than $8000 and less than $32000.
         {
            tax1 = RATE2 * income;                          //Second tax rate fifteen percent multiplied by income.
            tax2 = RATE2 * (income - RATE1_SINGLE_LIMIT);   // Second tax rate multiplied by income minus first single income rate.
         }
         if (income >= RATE2_SINGLE_LIMIT)                  //If users income is greater than 32000
         {
            tax1 = RATE3 * income;                          //Third tax rate twenty-five percent.
            tax2 = RATE3 * (income - RATE2_SINGLE_LIMIT);   //Third tax rate multiplied by income minus second single income rate.
         }
      }
      else if (maritalStatus.equals("m"))    //Else if statment if the user enters m.
      {
         if (income <= RATE1_MARRIED_LIMIT)  //If users income is less than $16000.
         {
            tax1 = RATE1 * income;           //First tax rate ten percent multiplied by income.
         }
         if (income >= RATE1_MARRIED_LIMIT && income <= RATE2_MARRIED_LIMIT)  //If users income is greater than $16000 and less than $64000
         {
            tax1 = RATE2 * income;                             //Second tax rate fifteen percent.
            tax2 = RATE2 * (income - RATE1_MARRIED_LIMIT);     //Second tax rate multiplied by income minus first married income rate.
         }
         if (income >= RATE2_MARRIED_LIMIT)  //If users income is greater than $64000.
         {
            tax1 = RATE3 * income;                          //Third tax rate twenty-five percent multiplied by income.
            tax2 = RATE3 * (income - RATE2_MARRIED_LIMIT);  //Third tax rate multiplied by income minus second married income rate.
         }
      }
      else 
         System.out.println("Error: please enter s for single, m for married.");    //Error message if user does not enter s or m when prompted.
         
         
      double totalTax = (tax1 + tax2);                      //This will calculate the uers taxes. 
      
      
      System.out.printf("The tax is $%.2f",+ totalTax);  //Prints out users taxes %.2f will only print two decimal places, $.00.
      
      
      }
}   