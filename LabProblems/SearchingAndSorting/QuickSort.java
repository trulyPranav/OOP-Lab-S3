package LabProblems.SearchingAndSorting;

// Write a Java program that implements Quick sort algorithm for sorting a list of names in ascending order.

import java.util.Scanner;

class QuickSort {
    static int partition(int arr[], int first, int last){
        int pivot = arr[last];
        int i = first - 1;

        for(int j=first; j<last; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // Placing Pivot in its correct position:
        int temp = arr[i+1];
        arr[i+1] = arr[last];
        arr[last] = temp;

        return i+1;
    }

    static void quicksort(int arr[], int first, int last){
        if(first<last){
            int pivotIndex = partition(arr, first, last);
            quicksort(arr, first, pivotIndex-1);
            quicksort(arr, pivotIndex+1, last);
        }
    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter the Size of the Array: ");
        int n = src.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the Array Elements: ");
        for(int i=0; i<n; i++)
            arr[i] = src.nextInt();
        quicksort(arr, 0, arr.length - 1);
        System.out.print("Sorted Array: ");
        for(int num: arr)
            System.out.print(num + " ");
        src.close();
    }
}
