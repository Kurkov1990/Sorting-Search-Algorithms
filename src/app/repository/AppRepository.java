package app.repository;

import java.util.Random;

public class AppRepository {

    private int[] array;

    public AppRepository(int size, int bound) {
        Random random = new Random();
        this.array = new int[size];
        for (int i = 0; i < size; i++) {
            this.array[i] = random.nextInt(bound);
        }
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
