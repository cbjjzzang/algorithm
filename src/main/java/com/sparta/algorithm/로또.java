package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 로또 {
    static int n;
    static int[] arr;
    static boolean[] arr2;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            if(n == 0) {
                return;
            }
            arr = new int[n];
            arr2 = new boolean[n];
            for(int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            dfs(0, 0);
            System.out.println();
        }
    }

    static void dfs(int idx, int depth) {
        if(depth == 6) {
            for(int i=0;i<n;i++){
                if(arr2[i]){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }

        for(int i = idx; i < n; i++) {
            arr2[i] = true;
            dfs(i + 1, depth + 1);
            arr2[i] = false;
        }
    }
}
