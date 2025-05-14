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
