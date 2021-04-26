/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moreno.manuel
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.CardLayout;

public class PanelChanger implements ActionListener
{
    JPanel panels;

    public void init(Container pane)
    {
        JButton switcher = new JButton("Switch Active Panel!");
        switcher.addActionListener(this);

        JPanel login = new JPanel();
        login.setBackground(Color.CYAN);
        login.add(new JLabel("Welcome to login panel."));

        JPanel another = new JPanel();
        another.setBackground(Color.GREEN);
        another.add(new JLabel("Yeah, this is another panel."));

        panels = new JPanel(new CardLayout());
        panels.add(login);
        panels.add(another);

        pane.add(switcher, BorderLayout.PAGE_START);
        pane.add(panels, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent evt)
    {
        CardLayout layout = (CardLayout)(panels.getLayout());
        layout.next(panels);
    }

    public static void main(String[] args)
    {
         JFrame frame = new JFrame("CardLayoutDemo");
         PanelChanger changer = new PanelChanger();
         changer.init(frame.getContentPane());
         frame.pack();
         frame.setVisible(true);
    }
}
