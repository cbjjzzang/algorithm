package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자1로만들기 {
    static int n;
    static Integer[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        arr = new Integer[n+1];
        arr[0] = arr[1] = 0;

        int answer = recur(n);

        System.out.println(answer);
    }

    static int recur(int s) {

        if(arr[s] == null) {
            if(s % 6 == 0) {
                arr[s] = Math.min(recur(s - 1), Math.min(recur(s / 3), recur(s / 2))) + 1;
            } else if(s % 3 == 0) {
                arr[s] = Math.min(recur(s / 3), recur(s - 1)) + 1;
            } else if(s % 2 == 0) {
                arr[s] = Math.min(recur(s / 2), recur(s - 1)) + 1;
            } else {
                arr[s] = recur(s - 1) + 1;
            }
        }

        return arr[s];
    }
}
