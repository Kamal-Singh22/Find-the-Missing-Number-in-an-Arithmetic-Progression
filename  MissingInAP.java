import java.util.Arrays;

public class MissingInAP {

    public static int findMissingNumber(int[] arr) {
        // Sort the array
        Arrays.sort(arr);

        // Calculate the common difference (assuming at least 3 elements)
        int n = arr.length;
        int diff = Math.min(arr[1] - arr[0], arr[2] - arr[1]);

        // Traverse and find where the difference breaks
        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] - arr[i] != diff) {
                return arr[i] + diff;
            }
        }

        // If nothing is missing in between, return the next term in AP
        return arr[n - 1] + diff;
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 11, 9, 13, 7}; // Missing: 15
        int[] arr2 = {3, 9, 15, 21, 27, 33, 39, 45, 51, 57}; // Missing: 63

        System.out.println("Missing number (Test 1): " + findMissingNumber(arr1));
        System.out.println("Missing number (Test 2): " + findMissingNumber(arr2));
    }
}
