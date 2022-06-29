package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[]{64,42,73,41,32,53,16,24,57,42,74,55,36};

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(arr);
        System.out.println(bubbleSort.printArray(arr));
    }
}
