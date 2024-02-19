package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 체스판다시칠하기2 {
    static boolean[][] arr;
    static int n, m, k, min;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        min = k * k;

        arr = new boolean[n][m];


        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            char[] ss = st.nextToken().toCharArray();
            for (int j = 0; j < m; j++) {
                arr[i][j] = ss[j] == 'B';
            }
        }
    }
}
