package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N과M4 {
    static int[] arr;
    static int n, m;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[m];
        dfs(0, 1);
        System.out.println(sb);

    }

    public static void dfs(int depth, int end) {
        if (depth == m) {
            for (int a : arr) {
                sb.append(a).append(" ");
            }
            sb.append('\n');
            return;
        }

        for (int i = end; i <= n; i++) {
            arr[depth] = i;
            dfs(depth + 1, i);
        }
    }
}

