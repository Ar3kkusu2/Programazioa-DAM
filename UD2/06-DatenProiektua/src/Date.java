/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zimo
 */
public class Date {
    
    private int day;
    private int month;
    private int year;
    
    public Date(int year, int month, int day){
        
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public int getDay(){
        
        return day;
    }
    
    public int getMonth(){
        
        return month;
    }
    
    public int getYear(){
        
        return year;
    }
    
    public void setDay(int day){
        
        this.day = day;
    }
    
    public void setMonth(int month){
        
        this.month = month;
    }
    
    public void setYear(int year){
        
        this.year = year;
    }
    
    public void setDate(int year, int month, int day){
        
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public String toString(){
        
        return String.format("%4d/%02d/%02d", year, month, day);
    }
    
    public String getHilabeteaLetretan(){
        
        String[] hilabete = {"Urtarrila","Otsaila","Martxoa","Apirila","Maiatza","Eikaina","Uztaila","Abuztua","Iraila","Urria","Azaroa","Abendua"};
        return hilabete[month-1];
    
    }
    
    public String getHilabeteaLetretan(String hizkuntza){
        
        String[][] hilabetea = {
            {"Urtarrila", "Otsaila", "Martxoa", "Apirila", "Maiatza", "Ekaina", "Uztaila", "Abuztua", "Iraila", "Urria", "Azaroa", "Abendua"}, 
            {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}, 
            {"January", "February", "Martz", "April", "June", "July", "Agoust", "September", "October", "Novenber", "Decenber"}
        };
        
        String m = " ";
        
        switch (hizkuntza){
 
            case "EU":
                m = hilabetea[0][month-1];
            case "ES":
                m = hilabetea[1][month-1];
            case "EN":
                m = hilabetea[2][month-1];
        }
        
       return m;
    }
}
