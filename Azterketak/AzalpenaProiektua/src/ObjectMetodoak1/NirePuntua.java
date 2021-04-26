/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectMetodoak1;

/**
 *
 * @author moreno.manuel
 */
public class NirePuntua {
    
    int x;
    int y;

    public NirePuntua(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString(){
        return "[" + x + ", " + y + "]";
    }
}
