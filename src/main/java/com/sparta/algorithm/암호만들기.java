package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 암호만들기 {
    static int l, c;
    static char[] arr2;
    static String ss = "";
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        l = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        arr2 = new char[c];
        arr2 = br.readLine().replace(" ", "").toCharArray();
        Arrays.sort(arr2);
        dfs(0, 0, "");
        System.out.println(sb);

    }

    static void dfs(int idx, int depth, String text) {
        if(depth == l) {
            if(Valid(text)) {
                sb.append(text).append('\n');
                return;
            }
        }

        for(int i = idx; i < c; i++) {
            dfs(i + 1, depth + 1, text + arr2[i]);
            text.replace(String.valueOf(arr2[i]), "");
        }
    }

    static boolean Valid(String text) {
        int m = 0;
        int n = 0;
        char[] t = text.toCharArray();
        for(char x : t) {
            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
                m++;
            } else {
                n++;
            }
        }
        return m >= 1 && n >= 2;

    }
}
