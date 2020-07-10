/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.List;
import tshirtalgorithms.models.TShirt;

/**
 *
 * @author mac
 */
// https://www.geeksforgeeks.org/quick-sort/
public class QuickSort {
    
    /* The main function that implements QuickSort() 
      arr[] --> Array to be sorted, 
      low  --> Starting index, 
      high  --> Ending index */
    public List<TShirt> sort(List<TShirt> arr, int low, int high, byte order) 
    { 
        if (low < high) 
        { 
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = partition(arr, low, high, order); 
  
            // Recursively sort elements before 
            // partition and after partition 
            sort(arr, low, pi-1, order); 
            sort(arr, pi+1, high, order); 
        } 
        return(arr);
    } 
    
    int partition(List<TShirt> arr, int low, int high, byte order) 
    { 
        int pivot = arr.get(high).getS().ordinal();  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
            // If current element is smaller than the pivot 
            
            // order = 0, ASC
            // order = 1, DESC
            switch(order) {
                case 0:
                    if (arr.get(j).getS().ordinal() < pivot) 
                    { 
                        i++; 

                        // swap arr[i] and arr[j] 
                        TShirt temp = arr.get(i); 
                        arr.set(i, arr.get(j)); // arr[i] = arr[j] 
                        arr.set(j, temp); 
                    }
                    break;
                case 1:
                    if (arr.get(j).getS().ordinal() > pivot) 
                    { 
                        i++; 

                        // swap arr[i] and arr[j] 
                        TShirt temp = arr.get(i); 
                        arr.set(i, arr.get(j)); // arr[i] = arr[j] 
                        arr.set(j, temp); 
                    }
            }
             
        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
        TShirt temp = arr.get(i+1); 
        arr.set(i+1, arr.get(high)); 
        arr.set(high, temp); 
  
        return i+1; 
    } 
  
  
    
  
    /* A utility function to print array of size n */
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
  
    
}
