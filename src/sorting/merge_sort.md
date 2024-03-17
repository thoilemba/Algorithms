# Merge Sort

**Merge Sort is a divide-and-conquer algorithm that works by recursively dividing the array into halves until each sub-array contains only one element, and then merging these sub-arrays in a sorted manner.**

## Algorithm

**mergeSort(arr[]) :**
    
If the given array `arr` has more than one element (`length <= 1`), do the following:
    
1. Calculate the middle index: `middle = length/2`.
2. Define two temporary arrays, `leftArray[]` and `rightArray[]`.
Copy the elements of `arr` from 0 index up to `middle-1` into `leftArray[]`.
Copy the elements of `arr` from `middle` index up to last into `rightArray[]`.
    
3. Recursively call `mergeSort()` on the left sub-array: `mergeSort(leftArray)`.
4. Recursively call `mergeSort()` on the right sub-array: `mergeSort(rightArray)`.
5. Merge the two sub-arrays using `merge()` function: `merge(array, leftArray, rightArray)`.
    
**merge(array, leftArray, rightArray) :**
- Initialize three pointers: `i` for `leftArray[]`, `j` for `rightArray[]`, and **`k`** for `arr[]`.
    
    
 - While `i` is less than the length of `leftArray[]` and `j` is less than the length of `rightArray[]`:
        - If `leftArray[i] <= rightArray[j]`, copy `leftArray[i]` to `arr[k]` and increment `i` and `k`.
        - Else, copy `rightArray[j]` to `arr[k]` and increment `j` and `k`.

- After the above loop, copy the remaining elements of `leftArray[]` and `rightArray[]` into `arr[]`, if any.


**Time complexity :**

Best : O(n log n)

Worst : O(n log n)

Average : O(n log n)

**Space complexity** : O(n) for all cases.

**In-place** : No

**Stability** : Yes

Time complexity of Merge Sort is **O(n log n)** in all 3 cases (worst, average and best) as merge sort always divides the array into two halves and takes linear time to merge two halves.

In merge sort, all elements are copied into an auxiliary array, so `n` auxiliary space is required for merge sort.