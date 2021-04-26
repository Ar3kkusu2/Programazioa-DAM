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
        textAreaEguneratu();
        
    }    
    private void anadirActionListener(ActionListener listener) {
        //GUIaren konponente guztiei gehitu listenerra
        view.jButtonGehitu.addActionListener(listener);        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        //listenerrak entzun dezakeen eragiketa bakoitzeko. Konponenteek 'actionCommad' propietatea daukate
        switch (actionCommand) {
            case "Gehitu":
                Izena iz = new Izena(view.jTextFieldIzena.getText());
                model.gehitu(iz);
                textAreaEguneratu();
                view.jTextFieldIzena.setText("");
                break;
            default:
                System.out.print("Nani?");
        }
    }
    
    public void textAreaEguneratu() {
        ArrayList<Izena> alIzenak = model.irakurri();
        String strIzenak = "";
        for (Izena iz : alIzenak) {
            strIzenak += iz.getIzena()+"\n";
        }
        view.jTextAreaIzenak.setText(strIzenak);
    }
    
 }