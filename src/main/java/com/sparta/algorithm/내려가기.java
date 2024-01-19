package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 내려가기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] dp1 = new int[3];
        int[] dp2 = new int[3];

        StringTokenizer st = new StringTokenizer(br.readLine());
        dp1[0] = dp2[0] = Integer.parseInt(st.nextToken());
        dp1[1] = dp2[1] = Integer.parseInt(st.nextToken());
        dp1[2] = dp2[2] = Integer.parseInt(st.nextToken());
        for(int i = 1; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            int d = dp1[0];
            int e = dp1[1];
            int f = dp1[2];

            dp1[0] = Math.max(d, e) + a;
            dp1[1] = Math.max(d, Math.max(e, f)) + b;
            dp1[2] = Math.max(e, f) + c;

            d = dp2[0];
            e = dp2[1];
            f = dp2[2];

            dp2[0] = Math.min(d, e) + a;
            dp2[1] = Math.min(d, Math.min(e, f)) + b;
            dp2[2] = Math.min(e, f) + c;
        }
        System.out.print(Math.max(dp1[0], Math.max(dp1[1], dp1[2])) + " ");
        System.out.print(Math.min(dp2[0], Math.min(dp2[1], dp2[2])));
    }
}
