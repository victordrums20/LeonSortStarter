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

    public static int[] merge(int[] a, int[] b ) {
        int[] c = new int[a.length + b.length];
        int j = 0, k = 0, i;
        for (i = 0; i < c.length && j < a.length && k < b.length; i++) {
            if (a[j] < b[k]) {
                c[i] = a[j++];
            } else {
                c[i] = b[k++];
            }

        }

        for (; i < c.length; i++) {
            if (j < a.length) {
                c[i] = a[j++];
            }
            if (k < b.length) {
                if (k < b.length) {
                    c[i] = b[k++];
                }
            }
        }
        return c;
    }
}
