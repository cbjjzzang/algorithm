package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BFSDFS {

    static int[][] check;
    static boolean[] checked;
    static int n;
    static int m;
    static int start;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());

        check = new int[1001][1001];
        checked = new boolean[1001];


        for(int i = 1; i <= m; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            //간선 연결 상태 저장
            check[x][y] = check[y][x] = 1;
        }
        dfs(start);

        //상태값 초기화
        checked = new boolean[1001];
        System.out.println();

        bfs();


    }

    public static void dfs(int a){
        checked[a] = true;
        System.out.println(a + " ");

        //아직 가지 않은 곳은 false이다. 따라서 간선이 연결되어 있으면서 가지않은곳을 찾으면 재귀
        for(int i = 1; i <= n; i++){
            if(check[a][i] == 1 && !checked[i]){
                dfs(i);
            }
        }
    }

    public static void bfs(){
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(start);
        checked[start] = true;
        System.out.print(start + " ");

        while (!queue.isEmpty()){
            int temp = queue.poll();

            for(int i = 1; i <= n; i++){
                if(check[temp][i] == 1 && !checked[i]){
                    queue.offer(i);
                    checked[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }
}
