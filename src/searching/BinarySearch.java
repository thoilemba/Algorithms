package searching;

import java.util.Scanner;

public class BinarySearch {

//	Binary search can be applied only to sorted arrays.
//	Time: O(log n); Space:O(1)
	
	static int binarySearch(int[] arr, int key) {
	//  start, end and mid are indices
		int start = 0;
		int end = arr.length - 1;
		int mid = 0;

		while (start <= end) {
			mid = (start + end) / 2;
			if (arr[mid] == key)
				return mid;
			else if (key < arr[mid]) { // left part from the middle element
				end = mid - 1;
			} else { // right part from the middle element
				start = mid + 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Implementing Binary Search".toUpperCase());

		int[] array = { 10, 20, 30, 40, 50 };
		System.out.print("Enter the item to be searched: ");
		int key = sc.nextInt();
		sc.close();

		int result = binarySearch(array, key);
//		int result = binarySearch(new int[] {1, 2, 3, 4, 5}, key);

		if (result == -1) {
			System.out.println("Searched item not found.");
		} else {
			System.out.println("Searched item found at index " + result);
		}
	}

}
