package com.swr.algorythms.sort;

import java.util.HashMap;

/**
 * Created by srockny16 on 4/4/2017.
 */
public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = new int[]{5,3,7,12,2, 24, 109, 15, 23, 49, 39, 69, 41, 1};

        HashMap map = new HashMap();
        InsertionSort sort = new InsertionSort();
        sort.sort(arr);


    }

    // Loop arr of data right to left **  max -1 to 0
    // loop arr again left to right 0 to i
    // commpare inner loop index arr[j] to arr[minI}
    // if larger (or smaller) swap - use triangle swap with temp var
    // temp = arr[j]
    // arr[j] = arr[j+1]
    // arr[j + 1] = temp
    // when nothing swaps, algo is done
    public void sort(int[] arr) {

        // if (arr == null || arr.length < 1 return;

        int minI = 0;
        int max = arr.length - 1;
        for (int i = 1; i <= max; i++) {
            for (int j = i; j > 0; j--) {
                ascendingSwap(j, j - 1, arr);
            }

        }

        this.toString(arr);

        max = arr.length - 1;
        for (int i = 1; i <= max; i++) {
            for (int j = i; j > 0; j--) {
                decendingSwap(j, j - 1, arr);
            }

        }

        this.toString(arr);
    }

    private void decendingSwap(int j, int k, int[] arr ) {
        if (arr[j] > arr[k]) {
            swap(j, k, arr);
        }
    }

    private void ascendingSwap(int j, int k, int[] arr ) {
        if (arr[j] < arr[k]) {
            swap(j, k, arr);
        }
    }

    private void swap(int i, int j, int[] arr ) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void toString(int[] arr){

        System.out.println("*************");
        for(int i:arr) {
            System.out.println(i);
        }
        System.out.println("*************");
    }
}

