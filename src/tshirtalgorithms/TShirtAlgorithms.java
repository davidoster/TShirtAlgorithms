/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tshirtalgorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import sorting.QuickSort;
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
        // type = 0, SIZE
        // type = 1, COLOR
        // type = 2, FABRIC
        
        
        int high = 6;
        List<TShirt> tShirts = generateTShirts(high + 1);
        System.out.println("Unsorted array");
        System.out.println("--------------");
        printTShirts(tShirts);
        
//        QuickSort qs = new QuickSort();
//        List<TShirt> qsSortedBySizeASC = new ArrayList<TShirt>(tShirts);
//        qsSortedBySizeASC = qs.sort(qsSortedBySizeASC, 0, high, (byte)0, (byte)0);
//        System.out.println("\nSorted array By Size ASC");
//        System.out.println("--------------");
//        printTShirts(qsSortedBySizeASC);
//        
//        List<TShirt> qsSortedBySizeDESC = new ArrayList<TShirt>(tShirts);
//        qsSortedBySizeASC = qs.sort(qsSortedBySizeDESC, 0, high, (byte)1, (byte)0);
//        System.out.println("\nSorted array By Size DESC");
//        System.out.println("--------------");
//        printTShirts(qsSortedBySizeDESC);

        QuickSort qs = new QuickSort();
        List<TShirt> qsSortedByColorASC = new ArrayList<TShirt>(tShirts);
        qsSortedByColorASC = qs.sort(qsSortedByColorASC, 0, high, (byte)0, (byte)1);
        System.out.println("\nSorted array By Color ASC");
        System.out.println("--------------");
        printTShirts(qsSortedByColorASC);
        
        List<TShirt> qsSortedByColorDESC = new ArrayList<TShirt>(tShirts);
        qsSortedByColorDESC = qs.sort(qsSortedByColorDESC, 0, high, (byte)1, (byte)1);
        System.out.println("\nSorted array By Color DESC");
        System.out.println("--------------");
        printTShirts(qsSortedByColorDESC);
    }
    
    public static List<TShirt> generateTShirts(int count) {
        List<TShirt> tShirts = new ArrayList<TShirt>();
        for(int i = 0; i < count; i++) {
            int k = generateNumber();
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
            default:
                return 0;
        }
    }
    
    private static int generateNumber() {
        Random random = new Random();
        return random.nextInt(7);
    }
    
    public static void printTShirts(List<TShirt> tShirts) {
        for (TShirt tShirt : tShirts) {
            System.out.println(tShirt);
        }
    }
}
