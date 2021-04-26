/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zimo
 */
public class Account {
    
    private String id;
    private String name;
    private int balance = 0;
    
    public Account(String id, String name){
        
        this.id = id;
        this.name = name;        
    }
    
    public Account(String id, String name, int balance){
        
        this.id = id;
        this.name = name; 
        this.balance = balance;
    }
    
    public String getID(){
        
        return id;
    }
    
    public String getName(){
        
        return name;
    }
    
    public int getBalance(){
        
        return balance;
    }
    
    public void setID(String id){
        
        this.id = id;
    }
    
    public void setName(String name){
        
        this.name = name;
    }
    
    public void setBalance(int balance){
        
        this.balance = balance;
    }
    
    public int credit(int amount){
        
        balance+=amount;
        return balance;
    }
    
    public int debit(int amount){
        
        if(amount <= balance){
            
            balance-=amount;
        }else{
            
            System.out.println("amount exceeded");
        }
        
        return balance;
    }
    
    public int transferTo(Account another, int amount){
        
        if(amount <= balance){
            
            another.balance+=amount;
            balance-=amount;
        }else{
            
            System.out.println("amount exceeded");
        }
        
        return balance;
    }
    
    public String toString() {
        
        return getClass().getName()+"[id = "+this.getID()+",name = "+this.getName()+",balance = "+this.getBalance()+"]";
    }
}
