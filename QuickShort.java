public class QuickShort {

    public static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            QuickShort qs = new QuickShort();
            int pivotIndex = qs.partition(array, left, right);
            quickSort(array, left, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, right);
        }
    }

    public int partition(int[] array, int left_pointer, int right_pointer) {
        int middle_pointer = (left_pointer + right_pointer) / 2;
        int swap;

        swap = array[right_pointer];
        array[right_pointer] = array[middle_pointer];
        array[middle_pointer] = swap;

        int pivot = array[right_pointer];
        right_pointer--;

        while (left_pointer <= right_pointer) {
            while (left_pointer <= right_pointer && array[left_pointer] < pivot) {
                left_pointer++;
            }

            while (left_pointer <= right_pointer && array[right_pointer] > pivot) {
                right_pointer--;
            }

            if (left_pointer <= right_pointer) {
                swap = array[left_pointer];
                array[left_pointer] = array[right_pointer];
                array[right_pointer] = swap;

                left_pointer++;
                right_pointer--;
            }
        }

        swap = array[left_pointer];
        array[left_pointer] = array[right_pointer + 1];
        array[right_pointer + 1] = pivot;

        return left_pointer;
    }

    public static void main(String[] args) {
        int[] array = {9, 7, 5, 11, 12, 2, 14, 3, 10, 6};
        quickSort(array, 0, array.length - 1);

        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
