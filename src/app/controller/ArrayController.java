package app.controller;

import app.model.ArrayModel;
import app.service.SearchProcessor;
import app.service.SortingProcessor;
import app.view.ArrayView;

import java.util.Scanner;

public class ArrayController {
    private final ArrayModel model;
    private final ArrayView view = new ArrayView();
    private final SearchProcessor searchProcessor = new SearchProcessor();
    private final SortingProcessor sortingProcessor = new SortingProcessor();
    Scanner scanner = new Scanner(System.in);

    public ArrayController() {
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        System.out.print("Enter the maximum value for the array elements: ");
        int maxValue = scanner.nextInt();

        model = new ArrayModel(size, maxValue);
    }


    public void sortArray() {
        int[] array = model.getArray();
        int[] sortedArray = sortingProcessor.mergeSort(array);
        model.setArray(sortedArray);
    }

    private String searchElement(int target) {
        return searchProcessor.binarySearch(model.getArray(), target)
                .map(index -> "\nElement is present on Index: " + index)
                .orElse("\nElement wasn't found");
    }

    public void runApp() {
        view.displayInitialArray(model.getArray());
        sortArray();
        view.showSortingResults(model.getArray());
        System.out.print("\nEnter element for searching:");
        int target = scanner.nextInt();
        view.getOutput(searchElement(target));
    }
}

