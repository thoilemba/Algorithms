package sorting;

import java.util.Scanner;

public class BubbleSort {
	
	// 0  1  2  3  4  - indices
	// 30 20 50 10 40 - given elements
	// Outer loop
	// 20 30 10 40 50 - 1st iteration
	// 20 10 30 40 50 - 2nd iteration
	// 10 20 30 40 50 - 3rd iteration
	// Same(already sorted) - 4th iteration
	public static void bubbleSort(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			boolean swapped = false;
			for(int j = 0; j < arr.length-i-1; j++) {
				if(arr[j+1] < arr[j]) {  // biggest element is placed at the last
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			
			// if swapping does not occur in the first iteration
			if(swapped == false) {
				return; // condition of already sorted array
			}
		}
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
		
		bubbleSort(arr);
		System.out.println("Sorted elements:");
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] +" ");
		}
		sc.close();
	}
}
