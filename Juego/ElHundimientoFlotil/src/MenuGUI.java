
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moreno.manuel
 */
public class MenuGUI extends JFrame{

    /**
     * @param args the command line arguments
     */
    
    private JButton StartButton;
    private JButton RestartButton;
    private JButton ExitButton;
    private JLabel MenuLabel;
    
    
    
    public MenuGUI() {
        this.initComponents();
    }
    
    private void initComponents() {
        this.StartButton = new JButton();
        this.RestartButton = new JButton();  
        
        this.setTitle("Versenke das Boot");
        this.setSize(new Dimension(400, 300));
        
        JButton b=new JButton("Start");  
        b.setBounds(50,100,95,30);  
        this.add(b);  
        this.setSize(400,400);  
        this.setLayout(null);  
        this.setVisible(true); 
        
    }
    
    private void StartButtonActionPerformed(final ActionEvent evt) {
        /*final JFrame p1 = new Player1GUI();
        final JFrame p2 = new Player2GUI();
        p1.setVisible(true);
        p2.setVisible(true);*/
    }
    
    public static void main(final String[] args) {
        
        try {
            for (final UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex2) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex2);
        }
        catch (IllegalAccessException ex3) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex3);
        }
        catch (UnsupportedLookAndFeelException ex4) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex4);
        }
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuGUI().setVisible(true);
            }
        });
    }
}
