package problem5;

class Sort {

    // swap
    static <E> void swap(E[] array, int i, int j) {
        E temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    static <E extends Comparable<E>> void bubbleSort(E[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {

                if (array[j].compareTo(array[j + 1]) > 0) {
                    swap(array, j, j + 1);
                }
            }
        }
    }
    static <E extends Comparable<E>> void mergeSort(E[] array) {
        if (array.length < 2) return;

        int mid = array.length / 2;

        E[] left = java.util.Arrays.copyOfRange(array, 0, mid);
        E[] right = java.util.Arrays.copyOfRange(array, mid, array.length);

        mergeSort(left);
        mergeSort(right);

        merge(array, left, right);
    }

    private static <E extends Comparable<E>> void merge(E[] array, E[] left, E[] right) {

        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i].compareTo(right[j]) <= 0) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        while (i < left.length) array[k++] = left[i++];
        while (j < right.length) array[k++] = right[j++];
    }
}