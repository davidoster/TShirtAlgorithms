/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import tshirtalgorithms.models.TShirt;

/**
 *
 * @author mac
 */
// https://www.netjstech.com/2019/01/bucket-sort-program-in-java.html
public class BucketSort {
    // order = 0, ASC
    // order = 1, DESC
    
    // type = 0, SIZE
    // type = 1, COLOR
    // type = 2, FABRIC
    
    
    public List<TShirt> sort(List<TShirt> arr, int noOfBuckets, byte order, byte type) {
        List<TShirt>[] buckets = new List[noOfBuckets+1];
        // initialiaze each position of the array with a LinkedList
        for(int i = 0; i <= noOfBuckets; i++){
            buckets[i] = new LinkedList<>();
        }
        // place the TShirts on the appropriate bucket
        for (TShirt tShirt : arr) {
            switch(order) {
                // ASC
                case 0:
                    switch(type) {
                        // SIZE
                        case 0:
                            buckets[tShirt.getS().ordinal()].add(tShirt);
                            break;
                        // COLOR
                        case 1:
                            buckets[tShirt.getC().ordinal()].add(tShirt);
                            break;
                        // FABRIC
                        case 2:
                            buckets[tShirt.getF().ordinal()].add(tShirt);
                            break;
                    }
                    break;
                // DESC
                case 1:
                    switch(type) {
                        // SIZE
                        case 0:
                            buckets[noOfBuckets - tShirt.getS().ordinal()].add(tShirt);
                            break;
                        // COLOR
                        case 1:
                            buckets[noOfBuckets - tShirt.getC().ordinal()].add(tShirt);
                            break;
                        // FABRIC
                        case 2:
                            buckets[noOfBuckets - tShirt.getF().ordinal()].add(tShirt);
                            break;
                    }
                    break;
            }
        }
        List<TShirt> result = new ArrayList<>();
        // merge all buckets into a List<TShirt> sorted
        for (List<TShirt> bucket : buckets) { // iterate on every bucket
            for (TShirt tShirt : bucket) { // iterate List TShirt on each bucket
                result.add(tShirt);
            }
        }
        return(result);
    }
    
//    private static void bucketSort(List<TShirt> intArr, int noOfBuckets){
//        // Create bucket array
//        List<Integer>[] buckets = new List[noOfBuckets];
//        // Associate a list with each index 
//        // in the bucket array         
//        for(int i = 0; i < noOfBuckets; i++){
//            buckets[i] = new LinkedList<>();
//        }
//        // 34 5 9 22 18 4 7
//        // XS M XS L XL XXXL XXL S M
//        // 0  2 0  3 4   6    5  3 2 
//        // Assign numbers from array to the proper bucket
//        // by using hashing function
//        for(int num : intArr){
//            //System.out.println("hash- " + hash(num));
//            buckets[hash(num)].add(num);
//        }
//        // sort buckets
//        for(List<Integer> bucket : buckets){
//            Collections.sort(bucket);
//        }
//        int i = 0;
//        // Merge buckets to get sorted array
//        for(List<Integer> bucket : buckets){
//            for(int num : bucket){
//                intArr[i++] = num;
//            }
//        }
//    }
//    
//    // A very simple hash function
//    private static int hash(int num){
//        return num/10;
//    }
    
}
