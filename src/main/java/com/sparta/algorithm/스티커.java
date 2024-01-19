package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 스티커 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            int k = Integer.parseInt(br.readLine());
            int[][] arr = new int[2][k];
            int[][] dp = new int[2][k];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int j = 0; j < k; j++) {
                arr[0][j] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < k; j++) {
                arr[1][j] = Integer.parseInt(st.nextToken());
            }
            if(k == 1) {
                System.out.println(Math.max(arr[0][0], arr[1][0]));
                continue;
            }
            dp[0][0] = arr[0][0];
            dp[0][1] = arr[0][1] + arr[1][0];

            dp[1][0] = arr[1][0];
            dp[1][1] = arr[1][1] + arr[0][0];
            for(int j = 2; j < k; j++) {
                dp[0][j] = Math.max(dp[1][j-1], dp[1][j-2]) + arr[0][j];
                dp[1][j] = Math.max(dp[0][j-1], dp[0][j-2]) + arr[1][j];
            }
            System.out.println(Math.max(dp[0][k-1], dp[1][k-1]));
        }

    }
}
