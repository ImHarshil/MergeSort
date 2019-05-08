/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

/**
 *
 * @author Nikhil
 */
public class MergeSortClass {
    public void mergeSort(int arr[],int lb,int ub){
        if(lb<ub){
            int mid = (lb+ub)/2;
            mergeSort(arr, lb, mid);
            mergeSort(arr,mid+1,ub);
            merge(arr, lb, mid, ub);
        }
    }
    
    private void merge(int arr[],int lb,int mid,int ub){
        int s = ub-lb+1;int i=lb,j=mid+1,k=0;
        int temp[]=new int[s];
        
        while(i<=mid && j<=ub){
        if(arr[i]<=arr[j]){
            temp[k]=arr[i];
            i++;
        }
        else{
            temp[k]=arr[j];
            j++;
        }
        k++;
        }
        while(i<=mid){
            temp[k]= arr[i];
            i++;k++;
        }
        
        while(j<=ub){
            temp[k]=arr[j];
            j++;k++;
        }
        
        for(i=lb,j=0;i<ub+1;i++,j++)
            arr[i]=temp[j];
        
    }
}
