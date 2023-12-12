package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 상수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int q = a / 100;
        int r = a % 100;
        int t = r / 10;
        int s = r % 10;
        a = s * 100 + t * 10 + q;

        int p = b / 100;
        int l = b % 100;
        int m = l / 10;
        int n = l % 10;
        b = n * 100 + m * 10 + p;

        System.out.println(Math.max(a, b));
    }
}
