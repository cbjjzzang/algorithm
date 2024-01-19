package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 점프 {

    static int n, sum;
    static int[][] arr;
    static long[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n+1][n+1];
        dp = new long[n+1][n+1];
        StringTokenizer st;

        for(int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dp[1][1] = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(arr[i][j] == 0) {
                    break;
                }
                if(i + arr[i][j] <= n) {
                    dp[i + arr[i][j]][j] += dp[i][j];
                }
                if(j + arr[i][j] <= n) {
                    dp[i][j + arr[i][j]] += dp[i][j];
                }
            }
        }
        System.out.println(dp[n][n]);
    }
}
