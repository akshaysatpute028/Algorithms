package Sorting;

import java.util.*;

public class SortPractice {
	
	private static void bubbleSort(int[] arr, int n) {
		int temp;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	private static void selectionSort(int[] arr,int n) {
		
		for(int i=0;i<n-1;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(arr[min]>arr[j]) {
					min=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		SortPractice sp=new SortPractice();
		Scanner s=new Scanner(System.in);
		int arr[]=new int[5];
		
		int n=arr.length;
		System.out.println("Enter Elements : ");
		for(int i=0;i<arr.length;i++)
			arr[i]=s.nextInt();
		
		
		System.out.println("Bubble sort : ");
		bubbleSort(arr,n);
		
		System.out.println("Selection sort : ");
		selectionSort(arr,n);

	}

}
