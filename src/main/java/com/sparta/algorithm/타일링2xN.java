package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 타일링2xN {
    static Integer[] dp = new Integer[1001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;

        int answer = recurve(n);

        System.out.println(answer);

    }

    static int recurve(int a) {
        if(dp[a] == null) {
            dp[a] = (recurve(a-1) + recurve(a-2)) % 10007;
        }
        return dp[a];
    }
}
