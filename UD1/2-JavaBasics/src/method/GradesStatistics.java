/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;

import java.util.Scanner;
import static method.search.contains;
import java.util.Arrays;

/**
 *
 * @author moreno.manuel
 */
public class GradesStatistics {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        int n;
        int[] student;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        n = in.nextInt();
        
        student = new int[n];
        
        for (int i = 0; i < student.length; ++i) {
            System.out.print("Enter the grade for student "+(i+1)+": ");
            student[i] = in.nextInt(); 
        }        
        
        gradesStatistics(student);
    }
    
    public static void gradesStatistics(int[] student) {
        
        int min = 0;
        int max = 0;
        double med = 0;
        double avg = 0;
        double sd = 0;
        
        
        System.out.print("[");
        for (int i = 0; i < student.length-1; ++i) {
            System.out.print(student[i]+", ");
        }        
        System.out.println(student[student.length-1]+"]");
        
        Arrays.sort(student); 
        
        for (int i = 0; i < student.length; ++i) {
            
            avg += student[i];
            
            if(i == 0){
                min = student[i];
            }else 
            if(student[i]<min) {
                min = student[i];
            }
            if(student[i]>max) {
                max = student[i];
            }
            sd += (student[i] - avg/student.length) * (student[i] - avg/student.length);
        } 
        
        avg/=student.length;
        sd = Math.sqrt(sd/student.length);
        
        if ( student.length % 2 == 1 ) {
            med = student[student.length/2];   
        }else {
            med = (student[student.length/2] + student[student.length/2 - 1])/2;
        } 
        
        System.out.println("The Average is: "+avg);
        System.out.println("The Median is: "+med);
        System.out.println("The Minimun is: "+min);
        System.out.println("The Maximun is: "+max);
        System.out.println("The Standard Deviation is: "+sd);
    }
}

