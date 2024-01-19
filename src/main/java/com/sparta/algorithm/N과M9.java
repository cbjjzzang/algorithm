package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class N과M9 {
    static int n, m;
    static int[] arr, arr2;
    static boolean[] check;
    static Set<String> set = new LinkedHashSet<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        arr = new int[n];
        arr2 = new int[m];
        check = new boolean[n];

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        dfs(0, 0);

        for(String s : set) {
            System.out.println(s);
        }
    }

    static void dfs(int idx, int depth) {
        if(depth == m) {
            String ss = "";
            for(int aa : arr2) {
                ss += aa + " ";
            }
            set.add(ss);
            return;
        }

        for(int i = 0; i < n; i++) {
            if(!check[i]) {
                check[i] = true;
                arr2[depth] = arr[i];
                dfs(idx + 1, depth + 1);
                check[i] = false;
            }
        }
    }
}
