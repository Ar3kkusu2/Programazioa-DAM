
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
public class AverageWithInputValidation {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
      final int NUM_STUDENTS = 3;
      int numberIn;
      boolean isValid;   
      int sum = 0;
      double average;
      
      Scanner in = new Scanner(System.in);
      
      for (int studentNo = 1; studentNo <= NUM_STUDENTS; ++studentNo) {
             
            isValid = false; 
            
            do {
              System.out.print("Enter the mark (0-100) for student "+studentNo+":");
              numberIn = in.nextInt();
              
              if ((numberIn >= 1 && numberIn <= 100)) {
              isValid = true;                 
              } else {
                System.out.println("Invalid input, try again...");  
              }
            } while (!isValid);

          sum += numberIn;
      }
      average = sum/NUM_STUDENTS;
      System.out.println("The average is: "+average);
    }
}
