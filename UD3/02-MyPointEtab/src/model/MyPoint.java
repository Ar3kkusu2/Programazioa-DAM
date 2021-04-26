package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moreno.manuel
 */
public class MyPoint {
    
    private int x;
    private int y;
    
    public MyPoint(){
        
        x = 0;
        y = 0;
    }
    
    public MyPoint(int x, int y){
        
        this.x = x;
        this.y = y;
    }
    
    public double distance(){
        
        double h = Math.sqrt(x*x + y*y);
        return (double) Math.round(h*100)/100;
    }
    
    public double distance(MyPoint another){
        
        double p1 = Math.abs(x - another.getX());
        double p2 = Math.abs(y - another.getY());
        double h = Math.sqrt(p1*p1 + p2*p2);       
        return (double) Math.round(h*100)/100;       
    } 
    
    public double distance(int x, int y){
        
        double p1 = Math.abs(this.x - x);
        double p2 = Math.abs(this.y - y);
        double h = Math.sqrt(p1*p1 + p2*p2);       
        return h;        
    }  
    
    public int getX(){
        
        return x;
    }
    
    public int getY(){
        
        return y;
    }
    
    public int[] getXY(){
        
        int[] xy = new int[2];
        xy[0] = x;
        xy[1] = y;
        return xy;
    }
    
    public void setX(int x){
        
        this.x = x;
    }
    
    public void setY(int y){
        
        this.y = y;
    }
    
    public void setXY(int x, int y){
        
        this.x = x;
        this.y = y;
    }
    
    public String toString() {
      return "P("+x+","+y+")";
   }
}
