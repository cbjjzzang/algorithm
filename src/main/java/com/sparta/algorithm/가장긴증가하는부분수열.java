package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가장긴증가하는부분수열 {

    static int[] v;
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        v = new int[a];
        dp = new int[a];
        for(int i = 0; i < a; i++){
            v[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < a; i++){
            dp[i] = 1;
            for(int j = 0; j < i; j++){
                if (v[j] < v[i] && dp[i] < dp[j] + 1){
                    dp[i] = dp[j] + 1;
                }
            }
        }
        int max = 0;
        for(int i = 0; i < a; i++){
            if(dp[i] > max)
                max = dp[i];
        }
        System.out.println(max);
    }
}
