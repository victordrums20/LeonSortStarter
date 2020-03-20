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
    }
}
