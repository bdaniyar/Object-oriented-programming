package bonustask.interfaces.main;
import java.util.Arrays;
import bonustask.interfaces.model.Sorter;
import bonustask.interfaces.services.CountingSort;

public class Main {
    public static void main(String[] args) {

        int[] arr = {3, 1, 2, 3, 0, 5, 2, 1};

        Sorter sorter = new CountingSort();

        int[] sorted = sorter.sort(arr);

        System.out.println("Original: " + Arrays.toString(arr));
        System.out.println("Sorted:   " + Arrays.toString(sorted));
    }
}
