/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author vilarchao.benat
 */
public class Player {

    private int id;
    private Tablero tablero1 = new Tablero(true);


     public Player(int id) {

        JFrame p1Frame = new JFrame("Player" + id);  
        JPanel p1Panel = new JPanel();
        p1Panel.setLayout(new FlowLayout());
        
        p1Frame.add(p1Panel);
        if (id == 1) {
            p1Frame.setBounds(250,200,400,400);
        } else {
            p1Frame.setBounds(700,200,400,400);
        }
        p1Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        p1Frame.setVisible(true);
        tablero1.setVisible(true);
        p1Frame.add(tablero1);
        
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Tablero getTablero() {
        return tablero1;
    }
    
}
