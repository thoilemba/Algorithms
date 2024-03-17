package sorting;

import java.util.Scanner;

public class MergeSort {
	
	  public static void mergeSort(int[] arr) {
			int length = arr.length;
			
			if(length <= 1) {
				return; // base case, end of recursive call
			}
			
			int middle = length/2; // midpoint
			
			// creating two sub-array from the original array
			int[] leftArray = new int[middle];
			int[] rightArray = new int[length-middle];
			
			// copying elements from 0 index upto middle-1 index
			for(int i = 0; i < middle; i++) {
				leftArray[i] = arr[i];
			}
			
			// copying elements from middle index upto last index
			for(int i = 0; i < length-middle; i++) {
				rightArray[i] = arr[i+middle];
			}
			
			mergeSort(leftArray);
			mergeSort(rightArray);
			merge(arr, leftArray, rightArray);
			
			mergeSort(leftArray);  // recursive call to further divide the
			mergeSort(rightArray);  // sub-arrays to smallest unit
			merge(arr, leftArray, rightArray); // merging the sub-arrays
		}
		
		// method to merge the elements
		private static void merge(int[] array, int[] leftArray, int[] rightArray) {
			int leftSize = leftArray.length;
			int rightSize = rightArray.length;
			
			int i = 0, l = 0, r = 0; // counter for resultant array, left and right array
			
			// assigning values from left and right arrays to the original array
		 //	 by comparing each elements
			while(l < leftSize && r < rightSize) {
				if(leftArray[l] < rightArray[r]) {
					array[i] = leftArray[l];
					i++;
					l++;
				}else {
					array[i] = rightArray[r];
					i++;
					r++;
				}
			}
			
			while(l < leftSize) {  // assigning remaining elements of right leftArray
				array[i] = leftArray[l];
				i++;
				l++;
			}
			
			while(r < rightSize) {  // assigning remaining elements of right rightArray
				array[i] = rightArray[r];
				i++;
				r++;
			}
		}
		
		
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the size of the array : ");
			int n = sc.nextInt();
			int[] array = new int[n];
			
			System.out.println("Enter the elements of the array : ");
			for(int i = 0; i < array.length; i++) {
				array[i] = sc.nextInt();
			}
			
			mergeSort(array);
			
			for(int i = 0; i < array.length; i++) {
				System.out.print(array[i] +" ");
			}
			
			sc.close();
		}
	}