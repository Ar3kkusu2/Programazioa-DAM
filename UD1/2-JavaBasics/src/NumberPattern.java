
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
public class NumberPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        int size;   
        int n;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        size = in.nextInt();
        
        for (int row = 1; row <= size; row++) {  
            for (int col = 1; col <= size; col++) {  
                if (row + col >= size + 1) {                                    //a-b) row >= col     c-d) row + col <= size + 1
                    n = size - col +1;                                          //a) n = col     b) n = col - row + 1     c) n = size - col +1    d)n = size - col - row + 2
                    System.out.print(n+" ");
                } else {
                    System.out.print("  ");  
                }
            }
        
            System.out.println();
        }
    }
}
