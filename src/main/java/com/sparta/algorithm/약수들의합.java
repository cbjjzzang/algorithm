package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 약수들의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = Integer.parseInt(br.readLine());
            int sum = 0;
            int[] arr = new int[n+1];
            if(n == -1) {
                break;
            }

            for(int i = 1; i < n; i++) {
                if(n % i == 0) {
                    sum += i;
                    arr[i] = i;
                }
            }
            if(sum == n) {
                sb.append(n).append(" = 1");
                for(int i = 2; i < n; i++) {
                    if(arr[i] != 0) {
                        sb.append(" + ").append(arr[i]);
                    }
                }
            } else {
                sb.append(n).append(" is NOT perfect.");
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
