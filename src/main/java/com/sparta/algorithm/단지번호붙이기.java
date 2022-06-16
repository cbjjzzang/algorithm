package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class 단지번호붙이기 {
    static int n;
    static int count;
    static int[][] arr;
    static boolean[][] visit;
    static ArrayList<Integer> record;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        count = 0;

        arr = new int[n][n];
        visit = new boolean[n][n];

        record = new ArrayList();

        for(int i = 0; i < n; i++){
            String row = br.readLine();
            for(int j = 0; j < n; j++){
                arr[i][j] = row.charAt(j) - '0';
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j] == 1 && !visit[i][j]){
                    count = 1;
                    dfs(i, j);
                    record.add(count);
                }
            }
        }

        Collections.sort(record);
        System.out.println(record.size());
        for (Integer integer : record) {
            System.out.println(integer);
        }
    }

    public static int dfs(int x, int y){
        visit[x][y] = true;

        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx > -1 && ny > -1 && nx < n && ny < n){
                if(arr[nx][ny] == 1 && !visit[nx][ny]){
                    dfs(nx, ny);
                    count++;
                }
            }
        }
        return count;
    }

}
