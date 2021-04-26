/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;  
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import model.Boton;
import model.Tablero;
import model.Player;

public class Menu {  
    public static void main(String s[]){  
        JFrame frame = new JFrame("Versenken Das Boot");  
        JPanel panel = new JPanel();  
        panel.setLayout(new FlowLayout());
        
        
        JButton SB = new JButton();  
        SB.setText("Start"); 
        SB.setPreferredSize(new Dimension(80, 30));
        panel.add(SB); 
        
        SB.addActionListener(e -> {
            try {
                Start();
            } catch (InterruptedException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
                
        JButton RB = new JButton();
        RB.setPreferredSize(new Dimension(80, 30));
        RB.setText("Restart"); 
        panel.add(RB);
        
        RB.addActionListener(e -> {
         //Restart();
        });
        
        JButton EB = new JButton(); 
        EB.setPreferredSize(new Dimension(80, 30));
        EB.setText("Exit"); 
        panel.add(EB);   
        
        EB.addActionListener(e -> {
         System.exit(0);
         
        });
        
        frame.add(panel);  
        frame.setBounds(525,100,300,80); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true); 
       
        
    }  
    
    public static void Start() throws InterruptedException{
        Player player1 = new Player(1);
        Player player2 = new Player(2);
        
        Barcos(player1, player2);
                
    }
    
    public static void colocarBarco(Player playerx, int n_barcos) throws InterruptedException 
	{
				playerx.getTablero().anadirBarco(n_barcos);
				
                                
				while(playerx.getTablero().proceso==1)
				{                                   
                                    Thread.sleep(1*1000);                                        
				}
		
	}

    private static void Barcos(Player player1, Player player2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
   
