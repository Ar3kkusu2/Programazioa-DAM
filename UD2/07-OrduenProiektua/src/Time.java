/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moreno.manuel
 */
public class Time {
    
    private int hour;
    private int minute;
    private int second;
    
    public Time(int hour, int minute, int second) {
        
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public Time(String ordua){
        
        String[] h = ordua.split(":");
        this.hour = Integer.parseInt(h[0]);
        this.minute = Integer.parseInt(h[1]);
        this.second = Integer.parseInt(h[2]);
    }
    
    public int getHour(){
        
        return hour;
    }
    
    public int getMinute(){
        
        return minute;
    }
    
    public int getSecond(){
        
        return second;
    }
    
    public void setHour(int hour){
        
        this.hour = hour;
    }
    
    public void setMinute(int minute){
        
        this.minute = minute;
    }
    
    public void setSecond(int second){
        
        this.second = second;
    }
    
    public void setTime(int hour, int minute, int second){
        
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public String toString(){
        
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    
    public Time nextSecond(){
        
        second++;
        
        if(second >= 60){
            
            second = second - 60;
            minute++;
            
            if( minute >= 60){
                
                minute = second - 60;
                hour++;
            }
        }
        
        return this;
    }
}
