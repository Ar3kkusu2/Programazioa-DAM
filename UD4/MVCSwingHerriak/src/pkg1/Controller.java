/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author moreno.manuel
 */
public class Controller implements ActionListener {
    private Model model;
    private View view;
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        anadirActionListener(this); 
        this.view.jTableHerriak.setModel(new TableHerria());
        
    }    
    private void anadirActionListener(ActionListener listener) {
        //GUIaren konponente guztiei gehitu listenerra
        view.jButtonGehitu.addActionListener(listener);
        view.jButtonAldatu.addActionListener(listener); 
        view.jButtonEzabatu.addActionListener(listener); 
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        //listenerrak entzun dezakeen eragiketa bakoitzeko. Konponenteek 'actionCommad' propietatea daukate
        switch (actionCommand) {
            case "GEHITU":
                Herria hBerri = new Herria(
                        view.jTextFieldHerria.getText(),
                        (String)view.jComboBoxProbintzia.getSelectedItem(),
                        view.jCheckBoxHondartza.isSelected(),
                        view.jTextAreaOharra.getText());
                
                model.gehitu(hBerri);
                taulaEguneratu();
                break;
            case "ALDATU":
                break;
            case "EZABATU":
                Herria hKendu = new Herria(
                        view.jTextFieldHerria.getText(),
                        (String)view.jComboBoxProbintzia.getSelectedItem(),
                        view.jCheckBoxHondartza.isSelected(),
                        view.jTextAreaOharra.getText());
                
                model.ezabatu(hKendu);
                taulaEguneratu();
                break;
            default:
                System.out.print("Nani?");
        }
    }   
    
    public void taulaEguneratu(){
        this.view.jTableHerriak.setModel(new TableHerria());
        view.jTextFieldHerria.setText("");
        view.jTextAreaOharra.setText("");
    }
 }
