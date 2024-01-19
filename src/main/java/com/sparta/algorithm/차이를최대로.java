package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 차이를최대로 {
    static int n;
    static int[] arr, arr2;
    static boolean[] check;
    static int max;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        arr2 = new int[n];
        check = new boolean[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dfs(0);
        System.out.println(max);

    }

    static void dfs(int idx) {
        if(idx == n) {
            int sum = 0;
            for(int i = 0; i < n-1; i++) {
                sum += Math.abs(arr2[i] - arr2[i+1]);
            }
            max = Math.max(sum, max);
            return;
        }

        for(int i = 0; i < n; i++) {
            if(!check[i]) {
                arr2[idx] = arr[i];
                check[i] = true;
                dfs(idx + 1);
                check[i] = false;
            }
        }
    }
}
