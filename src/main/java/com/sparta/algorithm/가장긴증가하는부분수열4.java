package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 가장긴증가하는부분수열4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int[] dp = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int max = 1;
        dp[0] = 1;
        for(int i = 0; i < n; i++) {
            dp[i] = 1;
            for(int j = 0; j < i; j++) {
                if(arr[j] < arr[i] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    max = Math.max(max, dp[i]);
                }
            }
        }
        System.out.println(max);
        Stack<Integer> stack = new Stack<>();
        for(int i = n-1; i >= 0; i--) {
            if(dp[i] == max) {
                stack.push(arr[i]);
                max--;
            }

        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
