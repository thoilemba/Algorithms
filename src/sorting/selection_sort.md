# Selection Sort

**Selection sort is a sorting algorithm that selects the smallest element from the unsorted array and placed at the first position. The process continues until the array is entirely sorted.**

**In each iteration, the minimum element is bringing to the beginning of the index.**

## Algorithm
1. Set current element at location 0 as min.
2. Search the minimum element in the list.
3. Swap the minimum element with the min.
4. Increment min by 1 to point to the next location.
5. Repeat until the entire elements are sorted.

**Time Complexity :** 

Best : O(n^2)

Worst : O(n^2)

Average : O(n^2).

**Space Complexity :** O(1) for all cases.

**In-place**: Yes

**Stability** : No

The time complexity of the selection sort is the same in all cases. At every step, we have to find the minimum element and put it in the right place. The minimum element is not known until the end of the array is not reached.