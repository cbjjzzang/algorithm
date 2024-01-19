package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.*;

public class test {
    public static void main(String[] args) throws Exception {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Integer.parseInt(st.nextToken());

        // 일단 0으로 끝나는건 무조건 1

        long[] dp = new long[10];

        for (int i = 0; i < 10; i++) {
            dp[i] = 1;
        }

        // 1자리 = 10
        // 2자리 = 10+9+8..+1 = 55
        // 3자리 = 55+...
        // 자리수 늘어나면 바로 위에꺼 갯수 더한게 시작
        for (int j = 1; j < n; j++) {
            for (int i = 1; i < 10; i++) {
                // 숫자가 너무커서 10007 나눈 나머지 저
                dp[i] = (dp[i] + dp[i-1]) % 10007;
            }
        }

        long sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += dp[i];
        }
        // 10007 넘어가더라...그래서 마지막에도 나눈 나머지 출
        System.out.println(sum % 10007);
    }
}