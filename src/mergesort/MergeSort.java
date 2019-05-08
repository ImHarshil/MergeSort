/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

import java.io.IOException;

/**
 *
 * @author Nikhil
 */
public class MergeSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int array[]= {10,33,9,49,2,43,5,54,23,0};
        int num;
        System.out.println("sorted list is");
        MergeSortClass ms = new MergeSortClass();
        ms.mergeSort(array,0,9);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        
       }
        
}
