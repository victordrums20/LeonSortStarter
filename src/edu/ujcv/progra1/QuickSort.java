package edu.ujcv.progra1;

public class QuickSort implements SortTester {
    @Override
    public long sort(int[] arr) {
        long start = System.currentTimeMillis();
        int n = arr.length;
        quickSort(arr, 0, n-1);

        long end = System.currentTimeMillis();

        return end - start;
    }

    public static void quickSort(int[] arr, int start, int end){

        int partition = partition(arr, start, end);

        if(partition-1>start) {
            quickSort(arr, start, partition - 1);
        }
        if(partition+1<end) {
            quickSort(arr, partition + 1, end);
        }
    }
}
