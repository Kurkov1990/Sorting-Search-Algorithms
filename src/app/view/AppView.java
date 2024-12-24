package app.view;

import java.util.Arrays;
import java.util.Scanner;


public class AppView {
    private final Scanner scanner = new Scanner(System.in);


    public void displayInitialArray(int[] array) {
        System.out.println("\nArray before sorting: " + Arrays.toString(array));
    }

    public void showSortingResults(int[] sortedArray) {
        System.out.println("\nArray after sorting: " + Arrays.toString(sortedArray));
    }

    public void getOutput(String output) {
        System.out.println(output);
    }

    public int setArraySize() {
        System.out.print("\nEnter size for array: ");
        return scanner.nextInt();
    }

    public int setArrayBound() {
        System.out.print("\nEnter bound for array: ");
        return scanner.nextInt();
    }

    public int setSearchTarget() {
        System.out.print("\nEnter element for searching:");
        return scanner.nextInt();
    }


}




