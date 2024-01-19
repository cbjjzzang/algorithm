package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 퇴사 {
    static int n, max;
    static int[] arr, arr2, dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        arr = new int[n];
        arr2 = new int[n];
        dp = new int[n + 1];
        StringTokenizer st;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < n; i++) {
            if(i + arr[i] <= n) {
                dp[i + arr[i]] = Math.max(dp[i + arr[i]], dp[i] + arr2[i]);
            }
            dp[i + 1] = Math.max(dp[i], dp[i + 1]);
        }
        System.out.println(dp[n]);
    }
}
