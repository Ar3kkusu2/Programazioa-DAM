
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
public class BoxPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int size;   
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        size = in.nextInt();
        
        for (int row = 1; row <= size; row++) {  
            for (int col = 1; col <= size; col++) {  
                if (row == 1 || row == size || col == 1 || col == size) {         
                    System.out.print("# ");                                     //a) row == 1 || row == size || col == 1 || col == size
                } else {                                                        //b) row == 1 || row == size || row == col
                    System.out.print("  ");                                     //c) row == 1 || row == size || row == size - col + 1
                }                                                               //d) row == 1 || row == size || row == size - col + 1 || row == col
            }                                                                   //e) row == 1 || row == size || row == size - col + 1 || row == col || col == 1 || col == size
        
            System.out.println();
        }
    }
}
