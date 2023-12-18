package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연산자끼워넣기 {
    static int n;
    static int[] arr;
    static int[] arr2 = new int[4];
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < 4; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }
        dfs(arr[0], 1);

        System.out.println(max);
        System.out.println(min);

    }

    static void dfs(int num, int idx) {
        if(idx == n) {
            max = Math.max(max, num);
            min = Math.min(min, num);
            return;
        }

        for(int i = 0; i < 4; i++) {
            if(arr2[i] != 0) {
                arr2[i]--;

                switch (i) {
                    case 0 :
                        dfs(num + arr[idx], idx + 1);
                        break;
                    case 1 :
                        dfs(num - arr[idx], idx + 1);
                        break;
                    case 2 :
                        dfs(num * arr[idx], idx + 1);
                        break;
                    case 3 :
                        dfs(num / arr[idx], idx + 1);
                        break;
                }
                arr2[i]++;
            }
        }
    }
}