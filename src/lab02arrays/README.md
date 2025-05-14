# Lab 02 - Arrays

## Objectives

1. Write a program to sort following array: `int arr[] = {10, 50, 5, 100, 12};`
2. Write a program to find given input in array: int arr[] = {10, 20, 40, 90}

---

## Implementation

### Sorting Array
```java
package lab02arrays;

public class SortArray {
    public static void main(String[] args) {
        int arr[] = {10, 50, 5, 100, 12};
        System.out.print("Array before sorting: ");
        for (int element: arr) System.out.print(element + " ");
        System.out.println();

        // Use brute-force method to sort
        int arrLength = arr.length;
        for (int i = 0; i < arrLength; i++) {
            for (int j = 1; j < arrLength; j++) {
                if (arr[i] > arr[j]) {
                    // Swap them
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("Array after sorting: ");
        for (int element: arr) System.out.print(element + " ");
    }
}
```

**Output:**
```output
Array before sorting: 10 50 5 100 12 
Array after sorting: 5 100 50 12 10 
```

### Program to Search Element in Array
```java
package lab02arrays;

public class SearchElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 40, 90};
        int target = 20;

        // Sorted Array - Use Binary Search Algorithm
        int low = 0, high = arr.length-1;

        while(low <= high) {
            int mid = (low + high) / 2;
            if (target == arr[mid]) { // Target found
                System.out.println(target + " is found at index " + mid);
                return;
            }

            else if (arr[mid] < target) // Search right half
                low = mid;

            else // Search left half
                high = mid;
        }
        System.out.println("The element was not found on array.");
    }
}
```

**Output:**
```output
20 is found at index 1
```

---