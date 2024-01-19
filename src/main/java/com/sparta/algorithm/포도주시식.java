package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 포도주시식 {
    static int n;
    static Integer[] dp;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        dp = new Integer[n+1];
        arr = new int[n+1];
        for(int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        dp[0] = 0;
        dp[1] = arr[1];

        if(n > 1) {
            dp[2] = arr[1] + arr[2];
        }

        recur(n);

        System.out.println(dp[n]);
    }

    static int recur(int a) {
        if(dp[a] == null) {
            dp[a] = Math.max(Math.max(recur(a-2), recur(a-3) + arr[a-1]) + arr[a], recur(a-1));
        }

        return dp[a];
    }
}
