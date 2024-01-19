package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치수2 {
    static int n;
    static long[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        if(n == 0) {
            System.out.println(0);
        }
        if(n == 1) {
            System.out.println(1);
        }
        dp = new long[n + 1];
        dp[0] = 0;
        dp[1] = 1;


        for(int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        System.out.println(dp[n]);
    }
}
