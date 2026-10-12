package datastructures;

public class ArrayOperations {

    private final int[] array;
    private int size;

    public ArrayOperations(int capacity) {
        array = new int[capacity];
        size = 0;
    }

    public void insert(int value) {
        if (size == array.length) {
            System.out.println("Array is full.");
            return;
        }

        array[size++] = value;
        System.out.println(value + " inserted successfully.");
    }

    public void delete(int value) {
        int index = search(value);

        if (index == -1) {
            System.out.println(value + " not found.");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        size--;
        System.out.println(value + " deleted successfully.");
    }

    public int search(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }

        return -1;
    }

    public void display() {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }

        System.out.print("Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }

        return array[index];
    }
}