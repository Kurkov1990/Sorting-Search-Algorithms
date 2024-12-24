package app.service;

import java.util.Optional;

public class SearchService {

    public Optional<Integer> binarySearch(int[] array, int target) {
        int left = 0, right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return Optional.of(mid);
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return Optional.empty();
    }
}
