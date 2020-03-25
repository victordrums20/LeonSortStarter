package edu.ujcv.progra1;

import java.util.Random;

public class Promedio {

    public static void main (String[] args) {

        int[] arr1 = new int[10000];
        int[] arr2 = new int[10000];
        int[] arr3 = new int[10000];

        Random rd = new Random();

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Math.abs(rd.nextInt(1000));
            arr2[i] = Math.abs(rd.nextInt(1000));
            arr3[i] = Math.abs(rd.nextInt(1000));
        }

        long t1, t2, t3, t4, t5;
        double promheap, prommerge, prombubble, promquick;

        HeapSort hs = new HeapSort();
        t1 = hs.sort(arr1);
        t2 = hs.sort(arr2);
        t3 = hs.sort(arr3);
        promheap = (t1+t2+t3)/5;
        System.out.println("Promedio del HeapSort: " + promheap);

        MergeSort ms = new MergeSort();
        t1 = ms.sort(arr1);
        t2 = ms.sort(arr2);
        t3 = ms.sort(arr3);
        prommerge = (t1+t2+t3)/5;
        System.out.println("Promedio del MergeSort: " + prommerge);

        QuickSort qs = new QuickSort();
        t1 = qs.sort(arr1);
        t2 = qs.sort(arr2);
        t3 = qs.sort(arr3);
        promquick = (t1+t2+t3)/5;
        System.out.println("Promedio del QuickSort: " + promquick);

        BubleSort bs = new BubleSort();
        t1 = bs.sort(arr1);
        t2 = bs.sort(arr2);
        t3 = bs.sort(arr3);
        prombubble = (t1+t2+t3)/5;
        System.out.println("Promedio del BubbleSort: " + prombubble);
    }
}
