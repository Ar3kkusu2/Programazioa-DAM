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
public class MyCircle {
    
    private MyPoint center; 
    private int radius; 
    
    public MyCircle() {
        
        center = new MyPoint(0,0);
        radius = 1;
    }
    
    public MyCircle(int x, int y, int radius) {
        
        center = new MyPoint(x,y);
        this.radius = radius;
    }
    
    public MyCircle(MyPoint center, int radius){
        
        this.center = center;
        this.radius = radius;
    }
    
    public double distance(MyCircle another) {
        
        double p1 = Math.abs(this.center.getX() - another.center.getX());
        double p2 = Math.abs(this.center.getY() - another.center.getY());
        double h = Math.sqrt(p1*p1 + p2*p2);       
        return (double) Math.round(h*100)/100; 
    }
    
    /*public boolean isInside(MyPoint puntua) {
        
        return
    }*/
    
    public double getArea(){
        
        return Math.PI*(radius*radius);
    }
    
    public MyPoint getCenter(){
        
        return center;
    }
    
    public int getCenterX(){
        
        return center.getX();
    }
    
    public int getCenterY(){
        
        return center.getY();
    }
    
    public int[] getCenterXY() {
        
        int[] xy = new int[2];
        xy[0] = center.getX();
        xy[1] = center.getY();
        return xy;
    }
    
    public double getCircumference() {
        
        return 2*Math.PI*radius;
    }
    
    public int getRadius(){
        
        return radius;
    }
    
    public void setCenter(MyPoint center){
        
        this.center = center;
    }
    
    public void setCenter(int x){
        
        center.setXY(x,x);
    }
    
    public void setCenterX(int x){
        
        center.setX(x);
    }
    
    public void setCenterXY(int x, int y){
        
        center.setXY(x, y);
    }
    
    public void setCenterY(int y){
        
        center.setY(y);
    }
    
    public void setRadius(int radius){
        
        this.radius = radius;
    }
    
    public String toString(){
        
        return "C(C("+center.getX()+","+center.getY()+"),R("+getRadius()+"))";
    }
        
}
