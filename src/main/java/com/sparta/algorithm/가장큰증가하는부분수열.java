package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가장큰증가하는부분수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n+1];
        int[] dp = new int[n+1];

        for(int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = Integer.MIN_VALUE;
        dp[1] = arr[1];
        for(int i = 2; i <= n; i++) {
            dp[i] = arr[i];
            for(int j = 1; j < i; j++) {
                if(arr[j] < arr[i]) {
                    dp[i] = Math.max(dp[j] + arr[i], dp[i]);
                }
            }
        }

        for(int i = 1; i <= n; i++) {
            if(dp[i] > max) max = dp[i];
        }
        System.out.println(max);
    }
}
