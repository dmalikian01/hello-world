/**
 * Derek Malikian
 * Fall 2016
 * Assignment #1
 * 
 * The purpose of the program megaMillion, is to create a process for a user
 * to purchase lottery tickets.  The program will ask the user to enter the 
 * number of lottery tickets they would like to purchase between one and five.
 * Each ticket will be made up of six random numbers, the first group of five 
 * numbers will be between one and fifty-six, and the sixth number will be  
 * between one and forty-six.  There should be no repetition of numbers that
 * are in the same ticket.  The program will display the first five numbers of
 * each ticket in ascending order followed by the sixth number at the end.
 * The program will then ask the user if they would like to purchase more 
 * tickets, if answer is yes then the program will rerun, if the answer is
 * no then the program terminates. 
 */

/*
    To help develop a solution for the program, I first developed a method
    called ticket that will create an array of six numbers.  Using nested for 
    loops and the Math.random method, I was able to create random numbers 
    between 1-56 for the elements of the array and check them for equality.  
    Then sort the array with the Arrays.sort method, and overwrite the last 
    element with a value between 1-46 and then return the array.
    To begin I obtained a Scanner object so the program would be able to
    read user input. I used the do, while loop so I could ask the user if they 
    would like to purchase more tickets at the end.  The user will be prompted
    to enter the number of tickets, which will be saved in a int variable.  
    A nested for loop will call the ticket method, and generate the number of 
    tickets desired by the user.  The tickets will then be displayed using 
    the printf format.  The user will be prompted if they would like to 
    purchase more tickets.  Using the while loop, with the logical or 
    operators, and an if statement the program will determine whether to 
    continue or not.
*/ 

/*
    The data structures used in this program include, variables, strings, 
    classes, objects, arrays, methods, and data specific algorithms. 
*/

/*
    When running, the program will ask you to enter the number of lottery 
    tickets that you would like to purchase between one and five.  If five 
    tickets are requested then five tickets will be generated and displayed.
    You will then be asked if you would like to purchase more tickets, (Y/N).
    If y is entered the program will rerun and ask if you would like to 
    purchase tickets again, if n is entered the program will display, 
    Good Luck!, and terminate.
*/

/*
    The general purpose of the megaMillion class, is to create a user friendly  
    program that will generate an array of random numbers in the form of a 
    lottery ticket.
*/

import java.util.*;

public class megaMillion
{
   public static void main(String[] args)
   {   
      Scanner in = new Scanner(System.in);
      String answer;
   
      do
      {
         System.out.print("Please enter the number of tickets (1-5) that you would like to purchase: ");
         int count = in.nextInt();

         for (int counter = 1; counter <= count; counter++)
         {
            int[] y = ticket(count);
    
               for (int i = 0; i < y.length; i++)
               {
                  System.out.printf("%2d ", y[i]);      
               }  
                  System.out.println(); 
         }     
         
         System.out.print("Would you like to purchase more tickets, (Y/N)? ");
         answer = in.next();         
      } 
              
      while (answer.equals("Y") || answer.equals("y"));
      
         if (answer.equals("N") || answer.equals("n"))
         {        
            System.out.println("Good Luck!");
         }
   }  
         /**
            Creates an array of six random numbers
            @param x the call to array
            @return the sorted array
         */
            
         public static int[] ticket(int x)
         {
            int[] values = new int[6];
                   
              for (int i = 0; i < values.length; i++)
                  { 
                     values[i] = (int)(Math.random() * 56) + 1;
                     
                                         
                        for (int j = 0; j < values.length; j++)
                         {                         
                            for (int k = j + 1; k < values.length; k++)
                             {           
                                if (values[j] == values[k])
                                {                                    
                                    values[i] = (int)(Math.random() * 56) + 1;                                    
                                }
                             }                             
                         }                                        
                    }
                           Arrays.sort(values);   
                            values[5] =  (int)(Math.random() * 46) + 1;;    
                             return values;
         } 
}
