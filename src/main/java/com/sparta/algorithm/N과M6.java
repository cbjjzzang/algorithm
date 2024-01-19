package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N과M6 {
    static int n, m;
    static int[] arr, arr2;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        arr2 = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        dfs(0, 0);


    }

    static void dfs(int idx, int depth) {
        if(depth == m) {
            for(int aa : arr2) {
                System.out.print(aa + " ");
            }
            System.out.println();
            return;
        }

        for(int i = idx; i < n; i++) {
            arr2[depth] = arr[i];
            dfs(i + 1, depth + 1);
        }
    }
}
