/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tshirtalgorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import sorting.BubbleSort;
import sorting.BucketSort;
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
        // order = 0, ASC
        // order = 1, DESC

        // type = 0, SIZE
        // type = 1, COLOR
        // type = 2, FABRIC
        boolean display = false;
        int high = 4000;
        List<TShirt> tShirts = generateTShirts(high+1);
        if(display) {
            System.out.println("Unsorted array");
            System.out.println("--------------");
            printTShirts(tShirts);
        }
        
        doQuickSort(tShirts, high, display);
        doBubbleSort(tShirts, display);
        doBucketSort(tShirts, high, display);
        
        // implement 7,8 that do incremental sorting of the TShirts first by Size then by Color and then by Fabric
        
        
    }
    
    public static void doQuickSort(List<TShirt> tShirts, int high, boolean display) {
        TimePerformance timePerformance;
        long lapse = 0;
        QuickSort qs = new QuickSort();
        List<TShirt> qsSortedBySizeASC = new ArrayList<TShirt>(tShirts);
        timePerformance = new TimePerformance();
        qsSortedBySizeASC = qs.sort(qsSortedBySizeASC, 0, high, (byte)0, (byte)0);
        lapse = timePerformance.timeLapse();
        System.out.println("\n---QuickSort---\n");
        System.out.println("\nSorted array By Size ASC - Time: " + lapse);
        System.out.println("--------------");
        if(display) printTShirts(qsSortedBySizeASC);
        
        List<TShirt> qsSortedBySizeDESC = new ArrayList<TShirt>(tShirts);
        timePerformance = new TimePerformance();
        qsSortedBySizeDESC = qs.sort(qsSortedBySizeDESC, 0, high, (byte)1, (byte)0);
        lapse = timePerformance.timeLapse();
        System.out.println("\nSorted array By Size DESC - Time: " + lapse);
        System.out.println("--------------");
        if(display) printTShirts(qsSortedBySizeDESC);
      
        List<TShirt> qsSortedByColorASC = new ArrayList<TShirt>(tShirts);
        timePerformance = new TimePerformance();
        qsSortedByColorASC = qs.sort(qsSortedByColorASC, 0, high, (byte)0, (byte)1);
        lapse = timePerformance.timeLapse();
        System.out.println("\nSorted array By Color ASC - Time: " + lapse);
        System.out.println("--------------");
        if(display) printTShirts(qsSortedByColorASC);
        
        List<TShirt> qsSortedByColorDESC = new ArrayList<TShirt>(tShirts);
        timePerformance = new TimePerformance();
        qsSortedByColorDESC = qs.sort(qsSortedByColorDESC, 0, high, (byte)1, (byte)1);
        lapse = timePerformance.timeLapse();
        System.out.println("\nSorted array By Color DESC - Time: " + lapse);
        System.out.println("--------------");
        if(display) printTShirts(qsSortedByColorDESC);

        List<TShirt> qsSortedByFabricASC = new ArrayList<TShirt>(tShirts);
        timePerformance = new TimePerformance();
        qsSortedByFabricASC = qs.sort(qsSortedByFabricASC, 0, high, (byte)0, (byte)2);
        lapse = timePerformance.timeLapse();
        System.out.println("\nSorted array By Fabric ASC - Time: " + lapse);
        System.out.println("--------------");
        if(display) printTShirts(qsSortedByFabricASC);
        
        List<TShirt> qsSortedByFabricDESC = new ArrayList<TShirt>(tShirts);
        timePerformance = new TimePerformance();
        qsSortedByFabricDESC = qs.sort(qsSortedByFabricDESC, 0, high, (byte)1, (byte)2);
        lapse = timePerformance.timeLapse();
        System.out.println("\nSorted array By Fabric DESC - Time: " + lapse);
        System.out.println("--------------");
        if(display) printTShirts(qsSortedByFabricDESC);
        System.out.println("\n---QuickSort---\n");
        
    }
    
    public static void doBubbleSort(List<TShirt> tShirts, boolean display) {
        TimePerformance timePerformance;
        long lapse = 0;
        BubbleSort bs  = new BubbleSort();
        List<TShirt> bsSortedBySizeASC = new ArrayList<TShirt>(tShirts);
        timePerformance = new TimePerformance();
        bsSortedBySizeASC = bs.sort(bsSortedBySizeASC, tShirts.size(), (byte)0, (byte)0);
        lapse = timePerformance.timeLapse();
        System.out.println("\n---BubbleSort---\n");
        System.out.println("\nSorted array By Size ASC - Time : " + lapse);
        System.out.println("--------------");
        if(display) printTShirts(bsSortedBySizeASC);
        
        List<TShirt> bsSortedBySizeDESC = new ArrayList<TShirt>(tShirts);
        timePerformance = new TimePerformance();
        bsSortedBySizeDESC = bs.sort(bsSortedBySizeDESC, tShirts.size(), (byte)1, (byte)0);
        lapse = timePerformance.timeLapse();
        System.out.println("\nSorted array By Size DESC - Time : " + lapse);
        System.out.println("--------------");
        if(display) printTShirts(bsSortedBySizeDESC);
        
        List<TShirt> bsSortedByColorASC = new ArrayList<TShirt>(tShirts);
        timePerformance = new TimePerformance();
        bsSortedByColorASC = bs.sort(bsSortedByColorASC, tShirts.size(), (byte)0, (byte)1);
        lapse = timePerformance.timeLapse();
        System.out.println("\nSorted array By Color ASC - Time : " + lapse);
        System.out.println("--------------");
        if(display) printTShirts(bsSortedByColorASC);
        
        List<TShirt> bsSortedByColorDESC = new ArrayList<TShirt>(tShirts);
        timePerformance = new TimePerformance();
        bsSortedByColorDESC = bs.sort(bsSortedByColorDESC, tShirts.size(), (byte)1, (byte)1);
        lapse = timePerformance.timeLapse();
        System.out.println("\nSorted array By Color DESC - Time : " + lapse);
        System.out.println("--------------");
        if(display) printTShirts(bsSortedByColorDESC);
        
        List<TShirt> bsSortedByFabricASC = new ArrayList<TShirt>(tShirts);
        timePerformance = new TimePerformance();
        bsSortedByFabricASC = bs.sort(bsSortedByFabricASC, tShirts.size(), (byte)0, (byte)2);
        lapse = timePerformance.timeLapse();
        System.out.println("\nSorted array By Fabric ASC - Time : " + lapse);
        System.out.println("--------------");
        if(display) printTShirts(bsSortedByFabricASC);
        
        List<TShirt> bsSortedByFabricDESC = new ArrayList<TShirt>(tShirts);
        timePerformance = new TimePerformance();
        bsSortedByFabricDESC = bs.sort(bsSortedByFabricDESC, tShirts.size(), (byte)1, (byte)2);
        lapse = timePerformance.timeLapse();
        System.out.println("\nSorted array By Fabric DESC - Time : " + lapse);
        System.out.println("--------------");
        if(display) printTShirts(bsSortedByFabricDESC);
        System.out.println("\n---BubbleSort---\n");
    }
    
    public static void doBucketSort(List<TShirt> tShirts, int high, boolean display) {
        TimePerformance timePerformance;
        long lapse = 0;
        BucketSort bus = new BucketSort();
        timePerformance = new TimePerformance();
        List<TShirt>  busSortedBySizeASC = bus.sort(tShirts, high, (byte)0, (byte)0);
        lapse = timePerformance.timeLapse();
        System.out.println("\n---BucketSort---\n");
        System.out.println("\nSorted array By Size ASC - Time : " + lapse);
        System.out.println("--------------");
        if(display) printTShirts(busSortedBySizeASC);
        
        timePerformance = new TimePerformance();
        List<TShirt>  busSortedBySizeDESC = bus.sort(tShirts, high, (byte)1, (byte)0);
        lapse = timePerformance.timeLapse();
        System.out.println("\nSorted array By Size DESC - Time : " + lapse);
        System.out.println("--------------");
        if(display) printTShirts(busSortedBySizeDESC);
        
        timePerformance = new TimePerformance();
        List<TShirt>  busSortedByColorASC = bus.sort(tShirts, high, (byte)0, (byte)1);
        lapse = timePerformance.timeLapse();
        System.out.println("\nSorted array By Color ASC - Time : " + lapse);
        System.out.println("--------------");
        if(display) printTShirts(busSortedByColorASC);
        
        timePerformance = new TimePerformance();
        List<TShirt>  busSortedByColorDESC = bus.sort(tShirts, high, (byte)1, (byte)1);
        lapse = timePerformance.timeLapse();
        System.out.println("\nSorted array By Color DESC - Time : " + lapse);
        System.out.println("--------------");
        if(display) printTShirts(busSortedByColorDESC);
        
        timePerformance = new TimePerformance();
        List<TShirt>  busSortedByFabricASC = bus.sort(tShirts, high, (byte)0, (byte)2);
        lapse = timePerformance.timeLapse();
        System.out.println("\nSorted array By Fabric ASC - Time : " + lapse);
        System.out.println("--------------");
        if(display) printTShirts(busSortedByFabricASC);
        
        timePerformance = new TimePerformance();
        List<TShirt>  busSortedByFabricDESC = bus.sort(tShirts, high, (byte)1, (byte)2);
        lapse = timePerformance.timeLapse();
        System.out.println("\nSorted array By Fabric DESC - Time : " + lapse);
        System.out.println("--------------");
        if(display) printTShirts(busSortedByFabricDESC);
        System.out.println("\n---BucketSort---\n");
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
