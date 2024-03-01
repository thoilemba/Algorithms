package searching;

import java.util.Scanner;

public class LinearSearch {
	
//	Time: O(n); Space: O(1)
	static int linearSearch(int[] arr, int key) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Implementing Linear Search".toUpperCase());
		
		int[] array = {10, 20, 30, 40, 50};
		System.out.print("Enter the item to be searched: ");
		int key = sc.nextInt();
		sc.close();
		
		int result = linearSearch(array, key);
//		int result = linearSearch(new int[] {1, 2, 3, 4, 5}, key);
		
		if(result == -1) {
			System.out.println("Searched item not found.");
		}else {
			System.out.println("Searched item found at index "+ result);
		}
	}
}


/*
	Some considerations and potential edge cases:
	1. Null Array: 
		The code assumes that the array is not null.
		If the input array is null, it will result in a NullPointerException.
	2. Duplicate Values:
		The code will return the index of the first occurrence of the key in the array.
	3. Overflow:
		There is a risk of overflow if the array contains very large integers. 
*/

