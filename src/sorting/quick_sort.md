# Quick Sort

**Quicksort** is a sorting algorithm based on the **divide and conquer approach** where

1. An array is divided into subarrays by selecting a **pivot element** (element selected from the array).While dividing the array, the pivot element should be positioned in such a way that elements less than pivot are kept on the left side and elements greater than pivot are on the right side of the pivot.
2. The left and right subarrays are also divided using the same approach. This process continues until each subarray contains a single element.
3. At this point, elements are already sorted. Finally, elements are combined to form a sorted array.

## Algorithm

`quickSort(array, start, end)`:

Input: An array of integers 'array', start index 'start', end index 'end'.

Output: The array sorted in non-decreasing order.

1. if start >= end, return; // Base case: only one element remains
2. pivotIndex = partition(array, start, end) // Partition the array and get the pivot index
3. quickSort(array, start, pivotIndex-1) // Recursively sort the left partition
4. quickSort(array, pivotIndex+1, end) // Recursively sort the right partition

`partition(array, start, end)`:

Input: An array of integers 'array', start index 'start', end index 'end'.

Output: The index of the pivot element after partitioning.

1. pivot = array[end] // Choose the pivot as the last element.
2. i = start - 1 // Index of the smaller element.
3. for j = start to end-1 do
    1. if array[j] < pivot then
        1. i = i + 1.
        2. swap array[i] and array[j].
4. i = i + 1.
5. swap array[i] and array[end] // Move the pivot to its correct position.
6. return i // Return the index of the pivot.

**Time complexity :** 

Best : O(n log n)

Average : O(n log n)

Worst : O(n^2)

**Space complexity :** O(log n) for all cases.

**In-place** : Yes

**Stability** : No

The **worst case** occurs when the pivot element picked is either the greatest or the smallest element. This condition leads to the case in which the pivot element lies in an extreme end of the sorted array. One sub-array is always empty and another sub-array contains `n-1` elements. Thus, quicksort is called only on this sub-array.