/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author moreno.manuel
 */
public class GradesStatistics {

    /**
     *
     */
    public static void main(String args[]) {
        
        int n;
        int[] grades; 
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number of Students: ");
        n = in.nextInt();
        
        grades = new int[n];
        int min = 0;
        int max = 0;
        double sum = 0;
        
        for (int i = 0; i < grades.length; ++i) {
            System.out.print("Enter the Grade for Student "+(i+1)+": ");
            grades[i] = in.nextInt();     
            if(i == 0){
                min = grades[i];
            }else 
            if(grades[i]<min) {
                min = grades[i];
            }
            if(grades[i]>max) {
                max = grades[i];
            }
            
            sum += grades[i];
        }
        
        System.out.println("The Average: "+sum/grades.length);
        System.out.println("The Minimun: "+min);
        System.out.println("The Maximun: "+max);
        
        
    }
}
