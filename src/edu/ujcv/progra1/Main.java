package edu.ujcv.progra1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] arr = new int[10000];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = Math.abs(r.nextInt(10000));
        }

        //HeapSort hs = new HeapSort();
        //hs.heapSort(arr);
        //MergeSort ms = new MergeSort();
        //arr = ms.mergeSort(arr);
        //BubleSort bs = new BubleSort();
        //arr = bs.bubleSort(arr);
        QuickSort qs = new QuickSort();
        int n = arr.length;
        qs.quickSort(arr, 0, n-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("\n\ntarda "+ qs.sort(arr) + " milisegundos");
    }
}
