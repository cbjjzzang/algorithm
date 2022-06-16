package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 정수삼각형 {

    static int[][] s;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        s = new int[n][n];

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j <= i; j++){
                s[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i = n-1; i > 0; i--){
            for(int j = 0; j < i; j++){
                s[i-1][j] += Math.max(s[i][j], s[i][j+1]);
            }
        }
        System.out.println(s[0][0]);

    }
}
