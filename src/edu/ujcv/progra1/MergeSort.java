package edu.ujcv.progra1;

public class MergeSort  implements SortTester{
    @Override
    public long sort(int[] array) {
        long start = System.currentTimeMillis();
        mergeSort(array);

        long end = System.currentTimeMillis();

        return end - start;
    }

    public static int[] mergeSort(int[] a){
        if (a.length == 1)
            return a;

        int[] parteInferior = new int[a.length / 2];
        int[] parteSuperior = new int[a.length - parteInferior.length];
        int i = 0;

        for (; i < parteInferior.length; i++) {
            parteInferior[i] = a[i];
        }

        for (int j = 0; j < parteSuperior.length; j++) {
            parteSuperior[j] = a[i + j];
        }

        return merge(mergeSort(parteInferior),mergeSort(parteSuperior));
    }

    public static int[] merge(int[] inf, int[] sup ){
        
}
