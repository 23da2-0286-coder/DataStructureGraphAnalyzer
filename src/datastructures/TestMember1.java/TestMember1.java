package datastructures;

import java.util.Arrays;

public class TestMember1 {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("       DATA STRUCTURE & GRAPH ANALYZER");
        System.out.println("==========================================");

        // ==============================
        // ARRAY OPERATIONS
        // ==============================

        int[] array = new int[10];
        int size = 0;

        // INSERT
        System.out.println("\n--- ARRAY INSERT OPERATION ---");

        array[size++] = 10;
        array[size++] = 20;
        array[size++] = 30;
        array[size++] = 40;
        array[size++] = 50;

        System.out.println("Values inserted successfully.");

        // DISPLAY
        System.out.println("\n--- ARRAY DISPLAY ---");

        System.out.print("Array: ");

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        // SEARCH
        System.out.println("\n--- ARRAY SEARCH ---");

        int searchValue = 30;
        int searchIndex = -1;

        for (int i = 0; i < size; i++) {

            if (array[i] == searchValue) {
                searchIndex = i;
                break;
            }
        }

        if (searchIndex != -1) {
            System.out.println(
                searchValue +
                " found at index " +
                searchIndex
            );
        } else {
            System.out.println(
                searchValue + " not found."
            );
        }

        // DELETE
        System.out.println("\n--- ARRAY DELETE OPERATION ---");

        int deleteValue = 30;
        int deleteIndex = -1;

        for (int i = 0; i < size; i++) {

            if (array[i] == deleteValue) {
                deleteIndex = i;
                break;
            }
        }

        if (deleteIndex != -1) {

            for (int i = deleteIndex; i < size - 1; i++) {
                array[i] = array[i + 1];
            }

            size--;

            System.out.println(
                deleteValue +
                " deleted successfully."
            );

        } else {
            System.out.println(
                deleteValue + " not found."
            );
        }

        // DISPLAY AFTER DELETE
        System.out.println("\n--- ARRAY AFTER DELETE ---");

        System.out.print("Array: ");

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        // ==============================
        // SEARCHING
        // ==============================

        System.out.println(
            "\n=========================================="
        );

        System.out.println(
            "          SEARCHING OPERATIONS"
        );

        System.out.println(
            "=========================================="
        );

        int[] numbers = {
            10, 20, 30, 40, 50,
            60, 70, 80, 90, 100
        };

        int target = 70;

        System.out.println(
            "\nSorted Array: " +
            Arrays.toString(numbers)
        );

        System.out.println(
            "Searching for: " + target
        );

        // ==============================
        // LINEAR SEARCH
        // ==============================

        System.out.println("\n--- LINEAR SEARCH ---");

        long linearStart = System.nanoTime();

        int linearIndex = -1;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == target) {
                linearIndex = i;
                break;
            }
        }

        long linearEnd = System.nanoTime();

        if (linearIndex != -1) {

            System.out.println(
                "Linear Search: " +
                target +
                " found at index " +
                linearIndex
            );

        } else {

            System.out.println(
                "Linear Search: " +
                target +
                " not found."
            );
        }

        System.out.println(
            "Time: " +
            (linearEnd - linearStart) +
            " nanoseconds"
        );

        // ==============================
        // BINARY SEARCH
        // ==============================

        System.out.println("\n--- BINARY SEARCH ---");

        long binaryStart = System.nanoTime();

        int left = 0;
        int right = numbers.length - 1;
        int binaryIndex = -1;

        while (left <= right) {

            int middle = (left + right) / 2;

            if (numbers[middle] == target) {

                binaryIndex = middle;
                break;

            } else if (numbers[middle] < target) {

                left = middle + 1;

            } else {

                right = middle - 1;
            }
        }

        long binaryEnd = System.nanoTime();

        if (binaryIndex != -1) {

            System.out.println(
                "Binary Search: " +
                target +
                " found at index " +
                binaryIndex
            );

        } else {

            System.out.println(
                "Binary Search: " +
                target +
                " not found."
            );
        }

        System.out.println(
            "Time: " +
            (binaryEnd - binaryStart) +
            " nanoseconds"
        );

        // ==============================
        // COMPLEXITY
        // ==============================

        System.out.println(
            "\n--- COMPLEXITY ---"
        );

        System.out.println(
            "Linear Search Complexity: O(n)"
        );

        System.out.println(
            "Binary Search Complexity: O(log n)"
        );

        System.out.println(
            "\nLinear Search checks elements one by one."
        );

        System.out.println(
            "Binary Search repeatedly divides the search area in half."
        );

        // ==============================
        // FINAL
        // ==============================

        System.out.println(
            "\n=========================================="
        );

        System.out.println(
            "       MEMBER 1 DEMONSTRATION COMPLETE"
        );

        System.out.println(
            "=========================================="
        );
    }
}