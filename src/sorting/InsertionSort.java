package sorting;

import java.util.Scanner;

public class InsertionSort {
	
	// 0  1  2  3  4  - indices
	// 30 20 50 10 40 - given elements
	// 20 30 50 10 40 - 1st iteration
	// 20 30 50 10 40 - 2nd iteration
	// 10 20 30 50 40 - 3rd iteration
	// 10 20 30 40 50 - 4th iteration
	public static void insertionSort(int ar[]) {
	    for(int i = 1; i < ar.length; i++) {
	    	int current = ar[i];  // i starts from 2nd element
	    	int j = i - 1;		  // j starts from 1st element
	    	
			// Compare current with each element on the left of it
			// until an element smaller than it is found.
	    	while(j >= 0 && ar[j] > current) {
	    		ar[j+1] = ar[j];  // shifting ar[j] to right
	    		j--;
	    	}
	    	ar[j+1] = current;  // placing key in the correct position
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
		
		insertionSort(arr);

		System.out.println("Sorted elements:");
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] +" ");
		}
		sc.close();

	}
}
