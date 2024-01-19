package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 오르막수 {
    static int n;
    static Long[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new Long[n+1][10];

        Arrays.fill(arr[1], 1L);
        long s = 0;
        for(int i = 0; i < 10; i++) {
            s += recurv(n, i);
        }
        System.out.println(s % 10007);
    }

    static long recurv(int digit, int num) {
        if(digit == 1) {
            return arr[digit][num];
        }

        if(arr[digit][num] == null) {
            arr[digit][num] = 0L;
            for(int i = num; i < 10; i++) {
                arr[digit][num] += recurv(digit - 1, i);
                arr[digit][num] %= 10007;
            }
        }
        return arr[digit][num];
    }
}