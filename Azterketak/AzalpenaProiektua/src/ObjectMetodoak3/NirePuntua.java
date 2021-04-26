/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectMetodoak3;

/**
 *
 * @author moreno.manuel
 */
public class NirePuntua implements Cloneable {
    
    int x;
    int y;
    char[] izena;

    public NirePuntua(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString(){
        String strIzena = new String(izena);
        return strIzena+"[" + x + ", " + y + "]";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.x;
        hash = 83 * hash + this.y;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NirePuntua other = (NirePuntua) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    
    
}
