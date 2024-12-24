package app.controller;

import app.repository.AppRepository;
import app.service.SearchService;
import app.service.SortingService;
import app.view.AppView;


public class AppController {
    private AppRepository repository;
    private final AppView view = new AppView();
    private final SearchService searchProcessor = new SearchService();
    private final SortingService sortingProcessor = new SortingService();


    public void setArrayAttributes() {
        int size = view.setArraySize();
        int bound = view.setArrayBound();
        repository = new AppRepository(size, bound);
    }


    public void sortArray() {
        int[] array = repository.getArray();
        int[] sortedArray = sortingProcessor.mergeSort(array);
        repository.setArray(sortedArray);
    }

    private String searchElement(int target) {
        return searchProcessor.binarySearch(repository.getArray(), target)
                .map(index -> "\nElement is present on Index: " + index)
                .orElse("\nElement wasn't found");
    }

    public void runApp() {
        setArrayAttributes();
        view.displayInitialArray(repository.getArray());
        sortArray();
        view.showSortingResults(repository.getArray());
        int target = view.setSearchTarget();
        view.getOutput(searchElement(target));
    }
}

