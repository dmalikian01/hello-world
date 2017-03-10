import java.util.*;

public class Maze
{
   private String[] cells;
   
   public Maze(String[] contents)
   {  
      cells = contents;
   }
   
   public boolean isExit(int row, int column)
   {
      return (row == 0 || row == cells.length - 1
      || column == 0 || column == cells[row].length() - 1) 
      && cells[row].charAt(column) == ' ';
   }
   
   public boolean isWall(int row, int column)
   { 
      return cells[row].charAt(column) == '*';
   }
}            