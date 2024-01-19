package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 내리막길 {
    static int n, m;
    static int[][] map;

    static Integer dp[][];
    static int[] dx = {1, 0, 0, -1};
    static int[] dy = {0, 1, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        dp = new Integer[n][m];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int count = dfs(0, 0);
        System.out.println(count);

    }

    static int dfs(int x, int y) {
        if(dp[x][y] != null) {
            return dp[x][y];
        }
        if(x == n-1 && y == m-1) {
            return 1;
        }

        dp[x][y] = 0;

        for(int i = 0; i < 4; i++) {
            int xx = x + dx[i];
            int yy = y + dy[i];
            if(xx >= 0 && yy >= 0 && xx < n && yy < m) {
                if(map[x][y] > map[xx][yy]) {
                    dp[x][y] += dfs(xx, yy);
                }
            }
        }
        return dp[x][y];
    }
}
