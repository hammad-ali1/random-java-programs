/**
 * Printing elements of a multidimensional array (2-D in this case)
 */

public class TwoDArray 
{
   public static void main(String[] args)
   {
      int[][] array1 = {{1, 2, 3}, {4, 5, 6}, {9}};        
      int[][] array2 = {{1, 2}, {3}, {4, 5, 6, 7}}; 

      System.out.println("Values in array1 by row are");
      outputArray(array1);
      System.out.printf("%nValues in array2 by row are%n");
      outputArray(array2); 
   } 

   public static void outputArray(int[][] array)
   {
      for(int[] row: array){
         for(int element: row){
            System.out.printf("%d ",element);
         }
         System.out.println();
      }
      
   } 
} 