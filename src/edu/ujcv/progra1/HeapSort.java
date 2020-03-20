package edu.ujcv.progra1;

import java.util.PriorityQueue;

public class HeapSort implements SortTester {
    @Override
    public long sort(int[] array) {
        long start = System.currentTimeMillis();
        heapSort(array);

        long end = System.currentTimeMillis();

        return end - start;
    }

    public static int[] heapSort(int[] array) {
        int n = array.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(array, n, i);


        for (int i=n-1; i>=0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
            }
        }
    }
}