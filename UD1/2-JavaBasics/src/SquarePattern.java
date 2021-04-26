
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moreno.manuel
 */
public class SquarePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        int size;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size: ");
        size = in.nextInt();
        
        int row = 1;
        int col = 1;
    
        /*for (int row = 1; row <= size; row++) {  
            for (int col = 1; col <= size; col++) {  
            System.out.print("# ");
         }
         System.out.println();
      }*/
        do {
          do {
             System.out.print("# ");
             col++;
          }while(col <= size);
          row++;
          System.out.println();
          col = 1;
        }while(row <= size);
    }
}
