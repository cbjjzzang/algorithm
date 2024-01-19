package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LCS {
    static char[] arr1, arr2;
    static Integer[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        arr1 = br.readLine().toCharArray();
        arr2 = br.readLine().toCharArray();

        dp = new Integer[arr1.length][arr2.length];

        System.out.println(lcs(arr1.length - 1, arr2.length - 1));
    }

    static int lcs(int x, int y) {
        if(x == -1 || y == -1) {
            return 0;
        }

        if(dp[x][y] == null) {
            dp[x][y] = 0;

            if(arr1[x] == arr2[y]) {
                dp[x][y] = lcs(x - 1, y - 1) + 1;
            } else {
                dp[x][y] = Math.max(lcs(x - 1, y), lcs(x, y - 1));
            }
        }

        return dp[x][y];
    }
}
