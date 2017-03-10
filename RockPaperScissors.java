import java.util.*;

public class RockPaperScissors
{
     public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Player 1: Choose rock, scissors, or paper:");
        String player1 = scan.next().toLowerCase();
        
        System.out.println("Player 2: Choose rock, scissors, or paper:");
        String player2 = scan.next().toLowerCase();
        
        String paper;
        String rock;
        String scissors;
        
         
        if (player1.equals("paper"))
        
        {
         player1 = "paper";
        }
        else if (player1.equals("rock"))
        {
         player1 = "rock";
        }
        else if (player1.equals("scissors"))
        {
         player1 = "scissors";
        }
        
        
        if (player2.equals("paper"))
        
        {
         player2 = "paper";
        }
        else if (player2.equals("rock"))
        {
         player2 = "rock";
        }
        else if (player2.equals("scissors"))
        {
         player2 = "scissors";
        }
        
        
        if (player1.compareTo(player2) < 0)
        {
            System.out.println("Player1 wins: ");
        }
        else if (player2.compareTo(player1) < 0)
        {
            System.out.println("Player2 wins: ");
        }
        else if (player1.equals(player2))
        {
            System.out.println("Tie");
        }
    }
}        
 
        
              
   