package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += Integer.parseInt(s.substring(i, i+1));
        }

        System.out.println(sum);
    }
}
