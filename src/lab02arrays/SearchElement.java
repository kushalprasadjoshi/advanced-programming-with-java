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
