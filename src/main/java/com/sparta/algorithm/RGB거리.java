package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RGB거리 {

    static int red = 0;
    static int green = 1;
    static int blue = 2;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        dp = new int[n+1][3];
        dp[0][red] = 0;
        dp[0][green] = 0;
        dp[0][blue] = 0;

        for(int i = 1; i <= n; i++){
            st = new StringTokenizer(br.readLine());
            dp[i][red] = Integer.parseInt(st.nextToken());
            dp[i][green] = Integer.parseInt(st.nextToken());
            dp[i][blue] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i <= n; i++){
            dp[i][red] += Math.min(dp[i-1][green], dp[i-1][blue]);
            dp[i][green] += Math.min(dp[i-1][red], dp[i-1][blue]);
            dp[i][blue] += Math.min(dp[i-1][green], dp[i-1][red]);
        }

        System.out.println(Math.min(dp[n][red], Math.min(dp[n][blue], dp[n][green])));
    }
}
