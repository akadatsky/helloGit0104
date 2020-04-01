package com.company;

import java.util.Random;

public class Main {

    private static Random random = new Random();

    // test
    public static void main(String[] args) {
        System.out.println("TEST");
    }

    /**
     *
     * @param arr
     */
    private static void sortInsert(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
