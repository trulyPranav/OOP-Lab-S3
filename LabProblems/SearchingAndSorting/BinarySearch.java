package LabProblems.SearchingAndSorting;

// Write a JAVA Program that implements the Binary Search Algorithm.

import java.util.*;

class BinarySearch {
    static int binarySearch(int arr[], int left, int right, int target){
        if(left <= right) {
            int mid = left + (right-left)/ 2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] > target)
                return binarySearch(arr, left, mid-1, target);
            else 
                return binarySearch(arr, mid+1, right, target);
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int num = src.nextInt();
        System.out.println("Enter the Array Elements: ");
        int arr[] = new int[num];
        for(int i=0; i<num; i++)
            arr[i] = src.nextInt();
        System.out.print("Enter the Number to Search: ");
        int key = src.nextInt();
        Arrays.sort(arr);
        System.out.println("Array has been Sorted. Here is the new array: ");
        for(int n: arr)
            System.out.print(n +  " ");
        System.out.println();
        int findIndex = binarySearch(arr, 0, arr.length-1, key);
        if(findIndex == -1)
            System.out.println("Element Not Found in given array!");
        else 
            System.out.println("Element Found at index " + findIndex + " i.e, at position " + (findIndex+1));
        src.close();
    }
}
