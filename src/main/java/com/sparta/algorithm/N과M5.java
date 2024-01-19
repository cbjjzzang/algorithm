package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N과M5 {
    static int n, m = 0;
    static int[] arr;
    static int[] arr2;
    static boolean[] visit;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        arr2 = new int[m];
        visit = new boolean[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        dfs(0);

    }

    static void dfs(int depth) {
        if(depth == m) {
            for(int a : arr2) {
                System.out.print(a + " ");
            }
            System.out.println();
            return;
        }

        for(int i = 0; i < n; i++) {
            if(!visit[i]) {
                visit[i] = true;
                arr2[depth] = arr[i];
                dfs(depth + 1);
                visit[i] = false;
            }
        }
    }
}
