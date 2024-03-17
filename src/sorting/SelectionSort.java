package sorting;

import java.util.Scanner;

public class SelectionSort {
//	0  1  2  3  4 - Indices 
//	30 20 50 10 40 - Given
//	
	public static void selectionSort(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			int minIndex = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			
			if(minIndex != i) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter the elements of the array:");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		selectionSort(arr);
		System.out.println("Sorted elements:");
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] +" ");
		}
		sc.close();
	}
}
