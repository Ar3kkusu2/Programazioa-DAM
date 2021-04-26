/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moreno.manuel
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Titulo extends JPanel{
	
	JPanel barra;
	JPanel panel_titulo = new JPanel();
	JLabel titulo;
	JLabel titulo_visible;
	
	Titulo()
	{
		barra = new JPanel();
		//barra.setLayout(new GridLayout());
		setLayout(new GridLayout(2,1));
		panel_titulo.setBorder(new EmptyBorder(0,0,0,0));
		add(barra);
		
		//------------------------------
		
		add(panel_titulo);
		
		this.setBorder(new EmptyBorder(0,0,0,0));
		
		//this.setLayout(new GridLayout(2,1));
		
		//TITULO
		titulo = new JLabel("Versenke das Boot",SwingConstants.CENTER);
		titulo.setFont(new Font("DejaVu Sans Light",1,30));
		titulo.setForeground(new Color(51, 133, 255));
		titulo.setVisible(true);
	
		
		
		crearMenu();
		panel_titulo.add(titulo);
		
	}

	
	//---METODOS---
	
	public void crearMenu()
	{
		JMenuBar menu = new JMenuBar();
                barra.add(menu);
		
	} 
}
