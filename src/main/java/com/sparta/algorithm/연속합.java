package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연속합 {
    static int[] arr;
    static int n, max;
    static Integer[] arr2;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        arr2 = new Integer[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        arr2[0] = arr[0];
        max = arr[0];

        recur(n-1);

        System.out.println(max);
    }

    static int recur(int a) {
        if(arr2[a] == null) {
            arr2[a] = Math.max(recur(a-1) + arr[a], arr[a]);

            max = Math.max(arr2[a], max);
        }

        return arr2[a];
    }
}
