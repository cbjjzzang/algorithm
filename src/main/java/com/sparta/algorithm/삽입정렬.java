package com.sparta.algorithm;

public class 삽입정렬 {
    public static void main(String[] args) {
        int[] arr = {10, 1, 5, 8, 7, 6, 4, 3, 2, 9};

        for(int i = 1; i < arr.length; i++){
            int target = arr[i];
            int j = i-1;
            while(j >= 0 && target < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = target;
        }
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
