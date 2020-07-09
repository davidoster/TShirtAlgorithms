/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tshirtalgorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import tshirtalgorithms.models.Color;
import tshirtalgorithms.models.Fabric;
import tshirtalgorithms.models.Size;
import tshirtalgorithms.models.TShirt;

/**
 *
 * @author mac
 */
public class TShirtAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<TShirt> tShirts = generateTShirts(40);
        for (TShirt tShirt : tShirts) {
            System.out.println(tShirt);
        }
    }
    
    public static List<TShirt> generateTShirts(int count) {
        List<TShirt> tShirts = new ArrayList<TShirt>();
        for(int i = 0; i < count; i++) {
            int k = generateNumber();
            Color c = (Color)generateRandomField(0);
            TShirt e = new TShirt((Color)generateRandomField(0),(Fabric)generateRandomField(1),(Size)generateRandomField(2));
            
            tShirts.add(e);
        }
        return tShirts;
    }
    
    public static Object generateRandomField(int field) { // 0 = Color, 1 = Fabric, 2 = Size
        int k = generateNumber();
 
        switch(field) {
            case 0:
                Color c = Color.values()[k];
                return c;
            case 1:
                Fabric f = Fabric.values()[k];
                return f;
            case 2:
                Size s = Size.values()[k];
                return s;
        }
        return 0;
    }
    
    private static int generateNumber() {
        Random random = new Random();
        return random.nextInt(7);
    }
}
