package com.swr.algorythms.sort;

/**
 * Created by srockny16 on 4/4/2017.
 */
public class BubbleSort{

    public static void main(String[] args) {

        int[] arr = new int[]{5,3,7,12,2, 24, 109, 15, 23, 49, 39, 69, 41, 1};

        BubbleSort sort = new BubbleSort();
        sort.sort(arr);


    }

    // Loop arr of data to max -1
    // loop arr again to max - 2
    // commpare inner loop index arr[j] to arr[j + 1}
    // if larger (or smaller) swap - use triangle swap with temp var
    // temp = arr[j]
    // arr[j] = arr[j+1]
    // arr[j + 1] = temp
    // when nothing swaps, algo is done
    public int[] sort(int[] arr) {

        if (arr == null || arr.length < 2) return arr;

        int count = 0;
        int max = arr.length - 1;
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < max - i; j++) {
                ascendingSwap(j, arr);
                count++;
            }
        }
        this.toString(arr, count);

        count = 0;
        max = arr.length - 1;
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < max - i; j++) {
                decendingSwap(j, arr);
                count++;
            }
        }
        this.toString(arr, count);


        return arr;

    }

    private void decendingSwap(int j, int[] arr ) {
        if (arr[j] < arr[j + 1]) {
            swap(j, j + 1, arr);
        }
    }

    private void ascendingSwap(int j, int[] arr ) {
        if (arr[j] > arr[j + 1]) {
            swap(j, j + 1, arr);
        }
    }


    private void swap(int i, int j, int[] arr ) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void toString(int[] arr, int count){

        System.out.println("************* " + count + " steps");
        for(int i:arr) {
            System.out.println(i);
        }
        System.out.println("*************");
    }
}
