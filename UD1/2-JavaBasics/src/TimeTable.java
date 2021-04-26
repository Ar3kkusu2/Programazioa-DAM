
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
public class TimeTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        int size;   
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        size = in.nextInt();

        System.out.print(" * |");
        
        for (int col = 1; col <= size; ++col) {
            System.out.printf("%4d", col);
        }
        System.out.println(); 
 
        System.out.print("----");
        
        for (int col = 1; col <= size; ++col) {
            System.out.printf("%4s", "----");
        }
        System.out.println(); 

        for (int row = 1; row <= size; ++row) {  
            System.out.printf("%2d |", row);      
            for (int col = 1; col <= size; ++col) {  
                System.out.printf("%4d", row*col);
            }
            System.out.println();  
        }
    }
}
