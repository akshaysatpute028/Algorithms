package Sorting;

//Selection sort

/*
Best	            O(n^2)
Worst	            O(n^2)
Average	            O(n^2)
Space Complexity	O(1)
Stability	        No
 */

import java.util.*;

public class SelectionSort {
	
	void selectionSort(int array[]) {
		int size = array.length;
		for (int step = 0; step < size - 1; step++) {
			int min_idx = step;
			for (int j = step + 1; j < size; j++) {
				// To sort in descending order, change > to < in this line.
			    // Select the minimum element in each loop.
				if (array[j] < array[min_idx])
					min_idx = j;
			}
			// put min at the correct position
			int temp = array[step];
			array[step] = array[min_idx];
			array[min_idx] = temp;
		}
	}
	
	public static void main(String args[]) {
		SelectionSort ss = new SelectionSort();
		Scanner s=new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("Insert Elements : ");	
		for(int i=0;i<arr.length;i++)
			arr[i]=s.nextInt();
		
		ss.selectionSort(arr);
		System.out.println("Sorted Array in Ascending Order: ");
		System.out.println(Arrays.toString(arr));
	}
}

/*
 Selection sort is a sorting algorithm that selects the smallest element from an unsorted list 
 in each iteration and places that element at the beginning of the unsorted list.
 */
