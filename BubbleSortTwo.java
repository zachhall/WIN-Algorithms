public class BubbleSortTwo {
    public static void bubblesort(int[] array) {
        boolean isSorted = false;
        int lastUnsorted = array.length - 1;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < lastUnsorted; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    isSorted = false;
                    printArray(array);
                }
            }
            lastUnsorted--;
        }
        System.out.println("-- Sorted Array --");
        printArray(array);
    }

    public static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    // Prints the array
    public static void printArray(int arr[]) {
        // O(1) space, O(n) time
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        bubblesort(arr);
    }
}