package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 알파벳 {
    static int r, c = 0;
    static int[][] arr;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};;
    static int max = 0;
    static boolean[] alphabet = new boolean[26];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        arr = new int[r][c];
        for(int i = 0; i < r; i++) {
            String s = br.readLine();
            for(int j = 0; j < c; j++) {
               arr[i][j] = s.charAt(j) - 'A';
            }
        }
        dfs(0, 0, 1);
        System.out.println(max);

    }

    static void dfs(int x, int y, int depth) {
        alphabet[arr[x][y]] = true;
        max = Math.max(max, depth);

        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && ny >= 0 && nx < r && ny < c) {
                if(!alphabet[arr[nx][ny]]) {
                    dfs(nx, ny, depth + 1);
                    alphabet[arr[nx][ny]] = false;
                }
            }
        }
    }
}
