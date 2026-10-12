package datastructures;

public class Searching {

    public static int linearSearch(int[] array, int size, int target) {
        for (int i = 0; i < size; i++) {
            if (array[i] == target) {
                return i;
            }
        }

        return -1;
    }

    // The array must be sorted in ascending order.
    public static int binarySearch(int[] array, int size, int target) {
        int left = 0;
        int right = size - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (array[middle] == target) {
                return middle;
            }

            if (array[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }

    public static void displaySearchResult(
            String algorithm,
            int target,
            int result) {
        if (result == -1) {
            System.out.println(algorithm + ": " + target + " not found.");
        } else {
            System.out.println(
                    algorithm + ": " + target + " found at index " + result);
        }
    }
}