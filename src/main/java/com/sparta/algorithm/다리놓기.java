package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 다리놓기 {

    static int[][] dp = new int[30][30];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            sb.append(combi(m, n)).append('\n');

        }
        System.out.println(sb);

    }

    static int combi(int n, int r){

        if(dp[n][r] > 0){
            return dp[n][r];
        }

        if(r == 0 || r == n){
            return dp[n][r] = 1;
        }
        return dp[n][r] = combi(n-1, r-1) + combi(n-1, r);
    }
}
