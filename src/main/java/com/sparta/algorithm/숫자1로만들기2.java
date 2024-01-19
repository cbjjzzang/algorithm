package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자1로만들기2 {
    static int n;
    static int[] dp;
    static int[] cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        dp = new int[n+1];
        dp[1] = 0;

        for(int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + 1;
            if(i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i/2] + 1);
            }

            if(i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i/3] + 1);
            }
        }

        System.out.println(dp[n]);
    }
}
