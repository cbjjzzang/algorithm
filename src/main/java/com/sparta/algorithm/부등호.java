package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class 부등호 {
    static int k;
    static List<String> list = new ArrayList<>();
    static boolean[] check = new boolean[10];
    static String[] arr;
    static int[] arr2, num;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        k = Integer.parseInt(br.readLine());

        arr = new String[k];
        arr2 = new int[k+1];
        num = new int[10];
        for(int i = 0; i < 10; i++) {
            num[i] = i;
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < k; i++) {
            arr[i] = st.nextToken();
        }
        dfs(0);
        Collections.sort(list);

        System.out.println(list.get(list.size() - 1));
        System.out.println(list.get(0));



    }

    static void dfs(int depth) {
        if(depth == k + 1) {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < k; i++) {
                String s = arr[i];
                if(s.equals(">")) {
                    if(arr2[i] <= arr2[i+1]) {
                        return;
                    }
                } else {
                    if(arr2[i] >= arr2[i+1]) {
                        return;
                    }
                }
            }
            for(int aa : arr2) {
                sb.append(aa);
            }
            list.add(sb.toString());
            return;
        }

        for(int i = 0; i < 10; i++) {
            if(!check[i]) {
                check[i] = true;
                arr2[depth] = num[i];
                dfs(depth + 1);
                check[i] = false;
            }
        }
    }
}
