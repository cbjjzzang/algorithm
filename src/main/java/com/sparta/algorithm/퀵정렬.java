package com.sparta.algorithm;

public class 퀵정렬 {
    public static void main(String[] args) {
        int[] arr = {3, 9, 4, 7, 5, 0, 1, 6, 8, 2, 10};
        printArray(arr);
        quickSort(arr);
        printArray(arr);
    }
    private static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length-1);
    }

    private static void quickSort(int[] arr, int start, int end){
        int part2 = partition(arr, start, end);
        if(start < part2 -1){
            quickSort(arr, start, part2 -1);
        }
        if(part2 < end){
            quickSort(arr, part2, end);
        }
    }

    private static int partition(int[] arr, int start, int end){
        int pivot = arr[(start + end) / 2];
        while(start <= end){
            while (arr[start] < pivot){
                start++;
            }
            while (arr[end] > pivot){
                end--;
            }
            if(start <= end){
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        return start;
    }

    private static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    private static void printArray(int[] arr){
        for(int a : arr){
            System.out.print(a + ", ");
        }
        System.out.println();
    }
}
