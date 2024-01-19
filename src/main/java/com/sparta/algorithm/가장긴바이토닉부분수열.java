package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가장긴바이토닉부분수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < n; i++) {
            dp1[i] = 1;
            for(int j = 0; j < i; j++) {
               if(arr[j] < arr[i] && dp1[i] < dp1[j] + 1) {
                   dp1[i] = dp1[j] + 1;
               }
            }
        }
        for(int i = n-1; i >= 0; i--) {
            dp2[i] = 1;
            for(int j = n-1; j > i; j--) {
                if(arr[j] < arr[i] && dp2[i] < dp2[j] + 1) {
                    dp2[i] = dp2[j] + 1;
                }
            }
        }
        int max = 0;
        for(int i = 0; i < n; i++) {
            int a = dp1[i] + dp2[i] - 1;
            max = Math.max(max, a);
        }
        System.out.println(max);

    }
}
