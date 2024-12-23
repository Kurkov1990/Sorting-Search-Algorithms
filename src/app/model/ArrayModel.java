package app.model;

import java.util.Random;

public class ArrayModel {

    private int[] array;

    public ArrayModel(int size, int bound) {
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
