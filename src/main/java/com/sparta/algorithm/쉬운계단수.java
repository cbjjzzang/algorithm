package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 쉬운계단수 {
    static Long[][] arr;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        arr = new Long[n + 1][10];

        Arrays.fill(arr[1], 1L);

        long result = 0;
        for(int i = 1; i <= 9; i++) {
            result += recur(n, i);
        }

        System.out.println(result % 1000000000);
    }

    static long recur(int digit, int val) {

        if(digit == 1) {
            return arr[digit][val];
        }

        if(arr[digit][val] == null) {
            if(val == 0) {
                arr[digit][val] = recur(digit - 1, 1);
            } else if(val == 9) {
                arr[digit][val] = recur(digit - 1, 8);
            } else {
                arr[digit][val] = recur(digit - 1, val - 1) + recur(digit - 1, val + 1);
            }
        }

        return arr[digit][val] % 1000000000;
    }
}
