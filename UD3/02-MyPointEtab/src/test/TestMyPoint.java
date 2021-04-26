/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import model.MyPoint;

/**
 *
 * @author moreno.manuel
 */
public class TestMyPoint {
    public static void main(String[] args) {
        
        MyPoint[] punto = new MyPoint[10];
        
        for (int c = 0; c < 10; c++){
            punto[c] = new MyPoint(c+1,c+1);
        }
        
        MyPoint p0 = new MyPoint(0,0);
        MyPoint p1 = new MyPoint(2,1);
        MyPoint p2 = new MyPoint(4,0);
        
        System.out.println(p0.distance());
        System.out.println(p1.distance());
        System.out.println(p2.distance());
        
        ArrayList<MyPoint> punto2 = new ArrayList<MyPoint>();
        
        
        
    
    }
}
