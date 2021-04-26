/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author moreno.manuel
 */
public class GehituHitza extends ObjectOutputStream{
    
    public GehituHitza(OutputStream out) throws IOException {
        super(out);
    }
    
    @Override
    public void writeStreamHeader() throws IOException {
        reset();
    }
}
