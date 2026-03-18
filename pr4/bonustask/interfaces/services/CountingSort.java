package bonustask.interfaces.services;

import bonustask.interfaces.model.Sorter;

public class CountingSort implements Sorter{
    
    @Override
    public int[] sort(int[] arr){
        int[] count = new int[11];

        for(int num:arr){
            count[num]++;
        }

        int[] result = new int[arr.length];
        int index = 0;

        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                result[index++] = i;
                count[i]--;
            }
        }

        return result;
    }
}
