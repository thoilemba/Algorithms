package sorting;

import java.util.Scanner;

public class QuickSort {
	
	// helper method for taking the array only as input
	public static void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length-1);
	}
	
	private static void quickSort(int[] arr, int start, int end) {
		
		if(start >= end) {
			return;
		}
		
		int pivot = partition(arr, start, end); // getting index of the pivot
		quickSort(arr, start, pivot-1); // left partition
		quickSort(arr, pivot+1, end); // right partition
	}
	
	/* This function takes last element as pivot,
	 places the pivot element at its correct position in sorted array,
	 and places all smaller (than pivot) to left of pivot 
	 and all greater elements to right of pivot */
	private static int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		
		int i = start-1;
		for(int j = start; j < end; j++) {
			if(arr[j] < pivot) {
				i++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		i++;
		arr[end] = arr[i];
		arr[i] = pivot;   // pivot is moved to the right place
		
		
		return i;  // index of the pivot
	}

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter the elements of the array:");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		quickSort(arr);
		System.out.println("Sorted elements:");
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] +" ");
		}
		sc.close();

	}

}
