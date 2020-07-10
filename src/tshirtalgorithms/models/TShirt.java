/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tshirtalgorithms.models;

/**
 *
 * @author Laptop
 */
public class TShirt {

    private Color c;
    private Fabric f;
    private Size s;

    public TShirt() {
    }
    
    
    public TShirt(Color c, Fabric f, Size s) {
        this.c = c;
        this.f = f;
        this.s = s;
        
    }

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }

    public Fabric getF() {
        return f;
    }

    public void setF(Fabric f) {
        this.f = f;
    }

    public Size getS() {
        return s;
    }

    public void setS(Size s) {
        this.s = s;
    }
    
    

    @Override
    public String toString() {
        return "TShirt{" + "c=" + c + ", f=" + f + ", s=" + s + '}';
    }
}
