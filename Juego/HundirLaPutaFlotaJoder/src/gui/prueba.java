package gui;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class prueba extends JFrame{
	
	
	public static JPanel panel;
	
	prueba()
	{
		setBounds(505,60,350,150); 
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
                setVisible(true);panel = new JPanel();
                panel.setLayout(new FlowLayout());
                add(panel);		
		setVisible(true);
		
	}
	
	

}

