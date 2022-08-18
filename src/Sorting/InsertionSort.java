package Sorting;

//Insertion sort

/*
Best	            O(n)
Worst	            O(n^2)
Average	            O(n^2)
Space Complexity	O(1)
Stability	        Yes
 */

//Compare key with the first element. If the first element is greater than key, 
//then key is placed in front of the first element.

import java.util.*;

public class InsertionSort {
	
	void insertionSort(int arr[]) {
		int size = arr.length;
		for (int step = 1; step < size; step++) {
			int key = arr[step];
			int j = step - 1;
			// Compare key with each element on the left of it until an element smaller than
		    // it is found.
		    // For descending order, change key<array[j] to key>array[j].
			while (j >= 0 && key < arr[j]) {
				arr[j + 1] = arr[j];
				--j;
			}
			arr[j + 1] = key;   // Place key at after the element just smaller than it.
		}
	}
	
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("Insert Elements : ");
		for(int i=0;i<arr.length;i++)
			arr[i]=s.nextInt();
		InsertionSort is = new InsertionSort();
		is.insertionSort(arr);
		
		System.out.println("Sorted Array in Ascending Order : ");
		System.out.println(Arrays.toString(arr));
	}
}

/*
Insertion sort is a sorting algorithm 
that places an unsorted element at its suitable place in each iteration.
*/