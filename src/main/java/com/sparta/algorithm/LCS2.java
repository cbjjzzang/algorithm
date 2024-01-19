package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class LCS2 {
    static char[] arr1, arr2;
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        arr1 = br.readLine().toCharArray();
        arr2 = br.readLine().toCharArray();

        dp = new int[arr1.length+1][arr2.length+1];

        for(int i = 1; i <= arr1.length; i++) {
            for(int j = 1; j <= arr2.length; j++) {
                if(arr1[i-1] == arr2[j-1]) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        Stack<Character> stack = new Stack<>();
        int a = arr1.length;
        int b = arr2.length;
        while (a > 0 && b > 0) {

            if(dp[a][b] == dp[a-1][b]) {
                a--;
            } else if(dp[a][b] == dp[a][b-1]) {
                b--;
            } else {
                stack.push(arr1[a-1]);
                a--;
                b--;
            }
        }
        System.out.println(dp[arr1.length][arr2.length]);
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}

