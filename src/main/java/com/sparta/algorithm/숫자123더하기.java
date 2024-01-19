package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자123더하기 {
    static int n;
    static int[] dp = new int[11];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for(int i = 4; i < 11; i++) {
            dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
        }
        for(int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            System.out.println(dp[m]);
        }
    }
}
