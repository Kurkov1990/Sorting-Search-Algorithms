package app.service;

import java.util.Arrays;

public class SortingService {

    public int[] mergeSort(int[] array) {

        if (array.length < 2) {
            return array;
        }

        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        left = mergeSort(left);
        right = mergeSort(right);

        return mergeArrays(left, right);
    }

    private int[] mergeArrays(int[] left, int[] right) {
        int[] mergeResult = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mergeResult[k++] = left[i++];
            } else {
                mergeResult[k++] = right[j++];
            }
        }

        while (i < left.length) {
            mergeResult[k++] = left[i++];
        }

        while (j < right.length) {
            mergeResult[k++] = right[j++];
        }

        return mergeResult;
    }
}
