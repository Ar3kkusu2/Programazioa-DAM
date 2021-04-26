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
public class MyRectangle {

    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    private MyPoint v4;
    
    public MyRectangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
        
        v1.setXY(x1, y1);
        v2.setXY(x2, y2);
        v3.setXY(x3, y3);
        v4.setXY(x4, y4);
    }
    
    public MyRectangle(MyPoint v1, MyPoint v2, MyPoint v3, MyPoint v4){
        
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.v4 = v4;
    }
    
    public String toString(){
        
        return "R(V1("+v1.getX()+","+v1.getY()+"),V2("+v2.getX()+","+v2.getY()+"),V3("+v3.getX()+","+v3.getY()+"),V4("+v4.getX()+","+v4.getY()+"))";
    }
    
    public void setRectangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        
        v1.setXY(x1, y1);
        v2.setXY(x2, y2);
        v3.setXY(x3, y3); 
        v4.setXY(x4, y4);
    }
    
    public void setRectangle1(int x, int y){
        
        v1.setXY(x, y);
    }
    
    public void setRectangle1(int x){
        
        v1.setXY(x, x);
    }
    
    public void setRectangle2(int x, int y){
        
        v2.setXY(x, y);
    }
    
    public void setRectangle2(int x){
        
        v2.setXY(x, x);
    }
    
    public void setRectangle3(int x, int y){
        
        v3.setXY(x, y);
    }
    
    public void setRectangle3(int x){
        
        v3.setXY(x, x);
    }
    
    public void setRectangle4(int x, int y){
        
        v4.setXY(x, y);
    }
    
    public void setRectangle4(int x){
        
        v3.setXY(x, x);
    }
    
    public int[] getRectangle(){
        
        int[] v = new int[8];
        v[0] = v1.getX();
        v[1] = v1.getY();
        v[2] = v2.getX();
        v[3] = v2.getY();
        v[4] = v3.getX();
        v[5] = v3.getY();
        v[6] = v4.getX();
        v[7] = v4.getY();
        return v;
    }
}
