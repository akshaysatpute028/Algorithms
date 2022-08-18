package Sorting;

//Bubble sort

/*
Best	            O(n)
Worst	            O(n^2)
Average	            O(n^2)
Space Complexity	O(1)
Stability	        Yes
 */

//After each iteration,
//the largest element among the unsorted elements is placed at the end.

import java.util.*;

public class BubbleSort {

	static void bubbleSort(int arr[]) {
		int size = arr.length;
		for (int i = 0; i < size - 1; i++)
			for (int j = 0; j < size - i - 1; j++) // loop to compare array elements
				if (arr[j] > arr[j + 1]) {     // > to < to sort in descending order
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}
	
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("Insert Elements : ");
		for(int i=0;i<arr.length;i++)
			arr[i]=s.nextInt();
		BubbleSort.bubbleSort(arr);
		System.out.println("Sorted Array in Ascending Order:");
		System.out.println(Arrays.toString(arr));
	}
}

/*
Bubble sort is a sorting algorithm that compares two adjacent elements 
and swaps them until they are not in the intended order.
Just like the movement of air bubbles in the water that rise up to the surface, 
each element of the array move to the end in each iteration.
*/