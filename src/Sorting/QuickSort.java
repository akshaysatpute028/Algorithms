package Sorting;

//Quick sort in Java

/*
Best	            O(n*log n)
Worst	            O(n^2)
Average	            O(n*log n)
Space Complexity	O(log n)
Stability	        No
*/

import java.util.*;

public class QuickSort {

	static int partition(int arr[], int low, int high) {
		 // choose the rightmost element as pivot
		 int pivot = arr[high];
		 // pointer for greater element
		 int i = (low - 1);

		 // traverse through all elements
		 // compare each element with pivot
		 for (int j = low; j < high; j++) {
			 if (arr[j] <= pivot) {
				// if element smaller than pivot is found
			    // swap it with the greatr element pointed by i
				i++;
				// swapping element at i with element at j
				int temp = arr[i];
			    arr[i] = arr[j];
			    arr[j] = temp;
			  }
		 }
		 // swapt the pivot element with the greater element specified by i
		 int temp = arr[i + 1];
		 arr[i + 1] = arr[high];
		 arr[high] = temp;
		 // return the position from where partition is done
		 return (i + 1);
		 
	}
	
	static void quickSort(int arr[], int low, int high) {
		 if (low < high) {
			   // find pivot element such that
			   // elements smaller than pivot are on the left
			   // elements greater than pivot are on the right
			   int pi = partition(arr, low, high);
			   // recursive call on the left of pivot
			   quickSort(arr, low, pi - 1);
			   // recursive call on the right of pivot
			   quickSort(arr, pi + 1, high);
		}

	}
	
	public static void main(String args[]) {
		SelectionSort ss = new SelectionSort();
		Scanner s=new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("Insert Elements : ");	
		for(int i=0;i<arr.length;i++)
			arr[i]=s.nextInt();

		 int size = arr.length;

		 QuickSort.quickSort(arr, 0, size - 1);

		 System.out.println("Sorted Array in Ascending Order: ");
		 System.out.println(Arrays.toString(arr));
	}
}

/*

Quicksort is a sorting algorithm based on the divide and conquer approach where

An array is divided into subarrays by selecting a pivot element (element selected from the array).

While dividing the array, the pivot element should be positioned in such a way that elements less than pivot 
are kept on the left side and elements greater than pivot are on the right side of the pivot.
The left and right subarrays are also divided using the same approach. This process continues 
until each subarray contains a single element.
At this point, elements are already sorted. Finally, elements are combined to form a sorted array.
 
 */
