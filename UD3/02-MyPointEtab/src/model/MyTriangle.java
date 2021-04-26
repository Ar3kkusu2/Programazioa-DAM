/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author moreno.manuel
 */
public class MyTriangle {
    
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        
        v1.setXY(x1, y1);
        v2.setXY(x2, y2);
        v3.setXY(x3, y3);
    }
    
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
        
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    
    public String toString(){
        
        return "T(V1("+v1.getX()+","+v1.getY()+"),V2("+v2.getX()+","+v2.getY()+"),V3("+v3.getX()+","+v3.getY()+"))";
    }
    
    public double getPerimeter(){
        
        double d1 = v1.distance(v2);
        double d2 = v2.distance(v3);
        double d3 = v3.distance(v1);
        
        return d1+d2+d3;             
    }
    
    /*public String getType(){
        
        
    }*/
    
    public void setTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        
        v1.setXY(x1, y1);
        v2.setXY(x2, y2);
        v3.setXY(x3, y3);        
    }
    
    public void setTriangle1(int x1, int y1){
        
        v1.setXY(x1, y1);
    }
    
    public void setTriangle1(int x1){
        
        v1.setXY(x1, x1);
    }
    
    public void setTriangle2(int x2, int y2){
        
        v2.setXY(x2, y2);
    }
    
    public void setTriangle2(int x2){
        
        v2.setXY(x2, x2);
    }
    
    public void setTriangle3(int x3, int y3){
        
        v3.setXY(x3, y3);
    }
    
    public void setTriangle3(int x3){
        
        v3.setXY(x3, x3);
    }
    
    public int[] getTriangle(){
        
        int[] v = new int[6];
        v[0] = v1.getX();
        v[1] = v1.getY();
        v[2] = v2.getX();
        v[3] = v2.getY();
        v[4] = v3.getX();
        v[5] = v3.getY();
        return v;
    }
    
    public String getType()
    {
        double d1 = v1.distance(v2);
        double d2 = v1.distance(v3);
        double d3 = v2.distance(v3);
        
        if (d1 == d2 && d2 == d3) {
            return "aldekide";
        }
        else if (d1 == d2 || d1 == d3 || d2 == d3) {
            return "isoszele";
        }
        return "eskaleno";
    }
}
