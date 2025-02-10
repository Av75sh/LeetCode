import java.util.Arrays;
public class quickSort {
    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 9, 10, 5, 55};
        int n = arr.length;

        quickSort2(arr, 0, n - 1); 

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    private static void quickSort2(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quickSort2(arr, low, pivotIndex - 1);
            quickSort2(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
