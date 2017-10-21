package com.swr.algorithms.sort;

public abstract class AbstractSort {

    protected void swap(int i, int j, int[] arr ) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void toString(int[] arr){

        if(arr != null) {
            int count = arr.length;
            System.out.println("************* " + count + " size");
        }

        for(int i:arr) {
            System.out.println(i);
        }
        System.out.println("*************");
    }
}
