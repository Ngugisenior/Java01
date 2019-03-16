package com.company;

public class BubbleSort {

    // Method bubbleSort
    static void bubbleSort(int[] arr){
        //length of the array
        int arrLength = arr.length;

        //declaring and initializing int temp
        int temp = 0;
        // Loop for Going through all the values
        for (int i = 0; i < arrLength; i++){
            //Starts from first index
            for (int j = 1; j <= arrLength-1; j++){
                // Compares array at index zero to that at index 1
                if (arr[j-1] > arr[j]){
                    //Swap Elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
	// Declaring and initializing the array
        int[] arr = {34,2,67,4,12,78,23,455,56,34,24,7};

        // Array before sorting
        for (int i = 0; i < arr.length; i++){
            //printing the array variables
            System.out.print(arr[i] + " ");
        }
        System.out.println();//for space
        // Sorting through bubble elements
        bubbleSort(arr); //passing array elements to the method bubbleSort
        //Array After bubbleSort
        System.out.println("Array after bubble sort: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
