package app.view;

import java.util.Arrays;


public class ArrayView {

    public void displayInitialArray(int[] array) {
        System.out.println("\nArray before sorting: " + Arrays.toString(array));
    }

    public void showSortingResults(int[] sortedArray) {
        System.out.println("\nArray after sorting: " + Arrays.toString(sortedArray));
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}




