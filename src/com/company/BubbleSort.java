package com.company;

public class BubbleSort {

    public void bubbleSort(int[] array){

        boolean isSorted = false;

        while(!isSorted){
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if(array[i-1] > array[i]){
                    int temp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = temp;
                    isSorted = false;
                }
            }
        }
    }

    public String printArray( int [] array){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
