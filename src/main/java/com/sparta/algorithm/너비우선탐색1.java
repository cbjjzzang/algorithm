package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 너비우선탐색1 {

    static int[] record;
    static boolean[] visit;
    static List<Integer>[] info;
    static int count = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        record = new int[n+1];
        visit = new boolean[n+1];
        info = new List[n+1];

        for(int i = 1; i <= n; i++){
            info[i] = new ArrayList<>();
        }

        for(int i = 1; i <= m; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            info[u].add(v);
            info[v].add(u);
        }

        for(int i = 1; i <= n; i++){
            info[i].sort(Collections.reverseOrder());
        }
        bfs(r);
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++){
            sb.append(record[i]).append("\n");
        }
        System.out.println(sb);

    }

    static void bfs(int a){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(a);
        visit[a] = true;
        record[a] = count++;

        while (!queue.isEmpty()){
            int temp = queue.poll();

            List<Integer> nextnodes  = info[temp];
            for(Integer nextnode : nextnodes){
                if(!visit[nextnode]){
                    visit[nextnode] = true;
                    queue.offer(nextnode);
                    record[nextnode] = count++;
                }
            }
        }
    }
}
