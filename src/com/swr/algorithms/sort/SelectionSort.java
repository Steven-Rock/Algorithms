package com.swr.algorithms.sort;

/**
 * Created by srockny16 on 4/4/2017.
 */
public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = new int[]{5,3,7,12,2, 24, 109, 15, 23, 49, 39, 69, 41, 1};

        SelectionSort sort = new SelectionSort();
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
        for (int i = max; i >= 0; i--) {
            for (int j = 0; j <= i ; j++) {
                minI = decendingSwap(j, minI, arr);
            }
            swap(i, minI, arr);
        }

        this.toString(arr);


        minI = 0;
        max = arr.length - 1;
        for (int i = max; i >= 0; i--) {
            for (int j = 0; j <= i ; j++) {
                minI = ascendingSwap(j, minI, arr);
            }
            swap(i, minI, arr);
        }

        this.toString(arr);
    }

    private int decendingSwap(int j, int k, int[] arr ) {
        if (arr[j] < arr[k]) {
            k = j;
        }

        return k;
    }

    private int ascendingSwap(int j, int k, int[] arr ) {
        if (arr[j] > arr[k]) {
            k = j;
        }

        return k;
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
