package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 토마토 {

    static int n;
    static int m;
    static int[][] tomato;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    static class Dot{
        int x;
        int y;
        int day;

        public Dot(int x, int y, int day){
            this.x = x;
            this.y = y;
            this.day = day;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        tomato = new int[n][m];

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++){
                tomato[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        bfs();
    }

    static void bfs(){
        Queue<Dot> q = new LinkedList<Dot>();
        int day = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(tomato[i][j] == 1)
                    q.offer(new Dot(i, j, 0));
            }
        }

        while(!q.isEmpty()){
            Dot dot = q.poll();
            day = dot.day;

            for(int i = 0; i < 4; i++){
                int nx = dot.x + dx[i];
                int ny = dot.y + dy[i];

                if(nx > -1 && ny > -1 && nx < n && ny < m){
                    if(tomato[nx][ny] == 0){
                        tomato[nx][ny] = 1;
                        q.offer(new Dot(nx, ny, day+1));
                    }
                }
            }
        }
        System.out.println(check() ? day : -1);
    }

    static boolean check(){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(tomato[i][j] == 0){
                    return false;
                }
            }
        }
        return true;
    }
}
