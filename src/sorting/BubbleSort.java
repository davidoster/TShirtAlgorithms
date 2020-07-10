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
// https://www.geeksforgeeks.org/bubble-sort/
public class BubbleSort {
    // type = 0, SIZE
    // type = 1, COLOR
    // type = 2, FABRIC
    
    // order = 0, ASC
    // order = 1, DESC
    public List<TShirt> sort(List<TShirt> arr, int n, byte order, byte type) 
    { 
        int i, j, temp; 
        boolean swapped; 
        switch(order) {
            // ASC
            case 0:
                switch(type) {
                    // SIZE
                    case 0:
                        for (i = 0; i < n - 1; i++)  
                        { 
                            swapped = false; 
                            for (j = 0; j < n - i - 1; j++)  
                            { 
                                if (arr.get(j).getS().ordinal() > arr.get(j + 1).getS().ordinal())  
                                { 
                                    // swap arr[j] and arr[j+1] 
                                    TShirt temp2 = arr.get(j); 
                                    arr.set(j, arr.get(j + 1));
                                    arr.set(j + 1, temp2); 
                                    swapped = true; 
                                } 
                            } 

                            // IF no two elements were  
                            // swapped by inner loop, then break 
                            if (swapped == false) 
                                break; 
                        }
                        break;
                    // COLOR    
                    case 1:
                        for (i = 0; i < n - 1; i++)  
                        { 
                            swapped = false; 
                            for (j = 0; j < n - i - 1; j++)  
                            { 
                                if (arr.get(j).getC().ordinal() > arr.get(j + 1).getC().ordinal())  
                                { 
                                    // swap arr[j] and arr[j+1] 
                                    TShirt temp2 = arr.get(j); 
                                    arr.set(j, arr.get(j + 1));
                                    arr.set(j + 1, temp2); 
                                    swapped = true; 
                                } 
                            } 

                            // IF no two elements were  
                            // swapped by inner loop, then break 
                            if (swapped == false) 
                                break; 
                        }
                        break;
                    // FABRIC
                    case 2:
                        for (i = 0; i < n - 1; i++)  
                        { 
                            swapped = false; 
                            for (j = 0; j < n - i - 1; j++)  
                            { 
                                if (arr.get(j).getF().ordinal() > arr.get(j + 1).getF().ordinal())  
                                { 
                                    // swap arr[j] and arr[j+1] 
                                    TShirt temp2 = arr.get(j); 
                                    arr.set(j, arr.get(j + 1));
                                    arr.set(j + 1, temp2); 
                                    swapped = true; 
                                } 
                            } 

                            // IF no two elements were  
                            // swapped by inner loop, then break 
                            if (swapped == false) 
                                break; 
                        }
                        break;
                }
                
                break;
            // DESC
            case 1:
                switch(type) {
                    // SIZE
                    case 0:
                        for (i = 0; i < n - 1; i++)  
                        { 
                            swapped = false; 
                            for (j = 0; j < n - i - 1; j++)  
                            { 
                                if (arr.get(j).getS().ordinal() < arr.get(j + 1).getS().ordinal())  
                                { 
                                    // swap arr[j] and arr[j+1] 
                                    TShirt temp2 = arr.get(j); 
                                    arr.set(j, arr.get(j + 1));
                                    arr.set(j + 1, temp2); 
                                    swapped = true; 
                                } 
                            } 

                            // IF no two elements were  
                            // swapped by inner loop, then break 
                            if (swapped == false) 
                                break; 
                        }
                        break;
                    // COLOR    
                    case 1:
                        for (i = 0; i < n - 1; i++)  
                        { 
                            swapped = false; 
                            for (j = 0; j < n - i - 1; j++)  
                            { 
                                if (arr.get(j).getC().ordinal() < arr.get(j + 1).getC().ordinal())  
                                { 
                                    // swap arr[j] and arr[j+1] 
                                    TShirt temp2 = arr.get(j); 
                                    arr.set(j, arr.get(j + 1));
                                    arr.set(j + 1, temp2); 
                                    swapped = true; 
                                } 
                            } 

                            // IF no two elements were  
                            // swapped by inner loop, then break 
                            if (swapped == false) 
                                break; 
                        }
                        break;
                    // FABRIC
                    case 2:
                        for (i = 0; i < n - 1; i++)  
                        { 
                            swapped = false; 
                            for (j = 0; j < n - i - 1; j++)  
                            { 
                                if (arr.get(j).getF().ordinal() < arr.get(j + 1).getF().ordinal())  
                                { 
                                    // swap arr[j] and arr[j+1] 
                                    TShirt temp2 = arr.get(j); 
                                    arr.set(j, arr.get(j + 1));
                                    arr.set(j + 1, temp2); 
                                    swapped = true; 
                                } 
                            } 

                            // IF no two elements were  
                            // swapped by inner loop, then break 
                            if (swapped == false) 
                                break; 
                        }
                        break;
                }
                break;
                
        }
        return arr;
    } 
  
    // Function to print an array  
    static void printArray(int arr[], int size) 
    { 
        int i; 
        for (i = 0; i < size; i++) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
}
