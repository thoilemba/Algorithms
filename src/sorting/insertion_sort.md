# Insertion Sort

**Insertion sort is a sorting algorithm that places an unsorted element at its suitable place in each iteration.**

## Algorithm

1. *The first element in the array is assumed to be sorted. Take the second element and store it separately in `current`.*
2. *Compare `current` with the first element. If the first element is greater than `current`, then `current` is placed in front of the first element. Now, the first two elements are sorted.*
3. *Take the third element and compare it with the elements on the left of it. Placed it just behind the element smaller than it. If there is no element smaller than it, move to the next iteration until all the elements are completely sorted.*

**Time Complexity :** 

Best : O(n)

Worst : O(n^2)

Average : O(n^2).

**Space Complexity :** O(1) for all cases.

**In-place**: Yes.

**Stability** : Yes.