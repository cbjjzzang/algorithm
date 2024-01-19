package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 모든순열 {
    static int n;
    static int[] arr;
    static boolean[] check;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        check = new boolean[n];

        dfs(0);
    }

    static void dfs(int depth) {
        if(depth == n) {
            for(int aa : arr) {
                System.out.print(aa + " ");
            }
            System.out.println();
            return;
        }

        for(int i = 1; i <= n; i++) {
            if(!check[i-1]) {
                check[i-1] = true;
                arr[depth] = i;
                dfs(depth + 1);
                check[i-1] = false;
            }

        }
    }
}
